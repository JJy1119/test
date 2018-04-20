package cn.freemud.framework.filesyetem.physicalimpl;

import cn.freemud.framework.filesyetem.IFile;
import cn.freemud.framework.filesyetem.IFileCreation;
import cn.freemud.framework.filesyetem.IFileStorage;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author shaocheng.ding
 */
@Service("PhysicalFileStorage")
public class PhysicalFileStorage implements IFileStorage{
    @Override
    public IFileCreation createFile(String path) {
        throw new NotImplementedException();
    }

    @Override
    public IFile getFile(String path) throws FileNotFoundException {
        File file =  ResourceUtils.getFile(path);
        return new PhysicalFile(file);
    }
}
