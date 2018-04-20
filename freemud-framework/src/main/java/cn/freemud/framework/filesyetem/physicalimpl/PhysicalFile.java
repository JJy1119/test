package cn.freemud.framework.filesyetem.physicalimpl;

import cn.freemud.framework.filesyetem.IFile;

import java.io.File;

/**
 * @author shaocheng.ding
 */
public class PhysicalFile implements IFile {
    final private File file;
    public PhysicalFile(File file){
        this.file = file;
    }
    @Override
    public String getFileName() {
        return file.getName();
    }
}
