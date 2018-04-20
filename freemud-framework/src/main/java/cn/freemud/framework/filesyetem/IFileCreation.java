package cn.freemud.framework.filesyetem;

import com.sun.media.jfxmediaimpl.MediaDisposer;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author shaocheng.ding
 */
public interface IFileCreation extends Closeable {
    /**
     * 获取文件输入流
     *
     * @return
     */
    InputStream getInputStream();

    /**
     * 保存修改到文件系统
     *
     * @return
     */
    IFile saveChanges();
}
