package cn.freemud.framework.filesyetem;

/**
 * @author dingshaocheng
 */
public interface IFileStorageManager {
    /**
     * 添加存储provider
     *
     * @param provider
     * @return
     */
    IFileStorageManager addProvider(IFileStorageProvider provider);

    /**
     * 在文件范围创建文件存储器
     *
     * @param scope 范围（主要用来区分存储器）
     * @return
     */
    IFileStorage createScope(String scope);
}
