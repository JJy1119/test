package cn.freemud.framework.caching.memory;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by ax03 on 2017/3/6.
 */

@ConfigurationProperties("framework.memorycache")
public class MemoryCacheOptions {

    private Long scanFrequency;
    private boolean compact;

    public MemoryCacheOptions() {
        this.compact = true;
        this.scanFrequency = 1 * 1000L;
    }

    /**
     * 获取过期扫描的频率。
     * @return
     */
    public Long getScanFrequency() {
        return scanFrequency;
    }

    /**
     * 设置过期扫描的频率。
     * @param milliseconds
     */
    public void setScanFrequency(Long milliseconds) {
        this.scanFrequency = milliseconds;
    }

    /**
     * 是否允许收缩内存。
     * @return
     */
    public boolean isCompact() {
        return compact;
    }

    /**
     * 设置是否启用收缩内存。
     * @param compact
     */
    public void setCompact(boolean compact) {
        this.compact = compact;
    }
}
