package cn.freemud.framework.caching.memory;

import com.sun.management.GarbageCollectionNotificationInfo;

import javax.management.NotificationEmitter;
import javax.management.openmbean.CompositeData;
import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.function.Consumer;

/**
 * 提供一个注册程序以便在GC收集进行的时候发起回掉。
 * @author dingshaocheng
 */
public final class GcNotification
{
    private final static String[] OLDGEN_COLLECTOR_NAMES = new String[]{
            // Oracle (Sun) HotSpot
            // -XX:+UseSerialGC
            "MarkSweepCompact",
            // -XX:+UseParallelGC and (-XX:+UseParallelOldGC or -XX:+UseParallelOldGCCompacting)
            "PS MarkSweep",
            // -XX:+UseConcMarkSweepGC
            "ConcurrentMarkSweep",
            // Oracle (BEA) JRockit
            // -XgcPrio:pausetime
            "Garbage collection optimized for short pausetimes Old Collector",
            // -XgcPrio:throughput
            "Garbage collection optimized for throughput Old Collector",
            // -XgcPrio:deterministic
            "Garbage collection optimized for deterministic pausetimes Old Collector"
    };

    private GcNotification()
    {

    }

    public static void register(Consumer<Object> callback, Object state)
    {
        ManagementFactory.getGarbageCollectorMXBeans().forEach(bean->
        {
            NotificationEmitter notification =  (NotificationEmitter)bean;
            notification.addNotificationListener((notification1, handback) -> {
                String notifType = notification1.getType();

                if (notifType.equals(GarbageCollectionNotificationInfo.GARBAGE_COLLECTION_NOTIFICATION)) {
                    CompositeData cd = (CompositeData) notification1.getUserData();
                    GarbageCollectionNotificationInfo info = GarbageCollectionNotificationInfo.from(cd);
                    String gcName = info.getGcName();
                    if (Arrays.binarySearch(OLDGEN_COLLECTOR_NAMES, gcName) >= 0) {

                        //System.out.println("FULL gc was notified !");
                        callback.accept(state);
                    }
                }
            }, null, null);
        });
    }
}
