package cn.freemud.framework.filesyetem;

import java.io.FileNotFoundException;

/**
 * @author shaocheng.ding
 */
public interface IFileStorage {

    /**
     * 创建文件
     *
     * @param path 文件路径（指定路径存在文件时将覆盖原有文件）
     * @return 文件创建器
     */
    IFileCreation createFile(String path);

    /**
     * 获取指定文件
     *
     * @param path 文件路径。
     * @return 文件描述
     */
    IFile getFile(String path) throws FileNotFoundException;
}
