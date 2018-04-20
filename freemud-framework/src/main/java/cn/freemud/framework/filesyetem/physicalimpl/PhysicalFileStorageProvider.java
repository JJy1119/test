package cn.freemud.framework.filesyetem.physicalimpl;

import cn.freemud.framework.filesyetem.IFileStorage;
import cn.freemud.framework.filesyetem.IFileStorageProvider;
import org.springframework.stereotype.Service;

/**
 * @author shaocheng.ding
 */
@Service
public class PhysicalFileStorageProvider implements IFileStorageProvider {
    @Override
    public IFileStorage getFileStorage(String scope) {
        if(scope==null){
            return new PhysicalFileStorage();
        }
        return null;
    }
}
