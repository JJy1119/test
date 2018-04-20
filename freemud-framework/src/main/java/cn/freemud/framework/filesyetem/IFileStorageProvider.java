package cn.freemud.framework.filesyetem;

/**
 * @author shaocheng.ding
 */
public interface IFileStorageProvider {
    /**
     * 获取文件存储器
     *
     * @param scope 文件区域
     * @return 文件存储器
     */
    IFileStorage getFileStorage(String scope);
}
