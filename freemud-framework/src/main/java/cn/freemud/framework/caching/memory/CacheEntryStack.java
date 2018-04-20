package cn.freemud.framework.caching.memory;

/**
 * Created by ax03 on 2017/3/6.
 */
public class CacheEntryStack {
    private final CacheEntryStack previous;
    private final CacheEntry entry;
    private static final CacheEntryStack empty = new CacheEntryStack();

    private CacheEntryStack() {
        previous = null;
        entry = null;
    }

    private CacheEntryStack(CacheEntryStack previous, CacheEntry entry) {
        if (previous == null) {
            throw new IllegalArgumentException("CacheEntryStack 构造函数参数 previous 不能为空。");
        }

        this.previous = previous;
        this.entry = entry;
    }

    public static CacheEntryStack createEmpty() {
        return empty;
    }

    public CacheEntryStack push(CacheEntry c) {
        return new CacheEntryStack(this, c);
    }

    public CacheEntry peek() {
        return entry;
    }
}
