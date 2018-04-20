package cn.freemud.framework.filesyetem;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

/**
 * @author shaocheng.ding
 */
@Service
public class FileStorageManager implements IFileStorageManager {
    private final HashSet<IFileStorageProvider> fileStorageProviders;

    public FileStorageManager(IFileStorageProvider[] storageProviderHashMap){
        fileStorageProviders = new LinkedHashSet<>(Arrays.stream(storageProviderHashMap).collect(Collectors.toSet()));
    }

    @Override
    public IFileStorageManager addProvider(IFileStorageProvider provider) {
        fileStorageProviders.add(provider);
        return this;
    }

    @Override
    public IFileStorage createScope(String scope) {
        //1、校验scope合法性
        //2、遍历fileStorageProviders查找storage
        IFileStorage fileStorage;
        for(IFileStorageProvider provider: fileStorageProviders){
            if((fileStorage = provider.getFileStorage(scope))!=null){
                return fileStorage;
            }
        }
        return null;
    }
}
