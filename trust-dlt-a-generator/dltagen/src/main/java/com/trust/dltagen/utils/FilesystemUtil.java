package com.trust.dltagen.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;

@Component
public class FilesystemUtil {

    @Value("${filesystem.rootDir:files}")
    private String rootDir;

    private boolean createDirectory(String ... directories) {
        File directory = Path.of(rootDir, directories).toFile();
        if(!directory.exists()) {
            return directory.mkdirs();
        }
        return true;
    }

    public String saveToFile(byte[] bytes, String fileName, String ... directories) throws IOException {
        createDirectory(directories);

        Path path = Path.of(Path.of(rootDir, directories).toString(), fileName);
        File file = path.toFile();
        try(OutputStream os = new FileOutputStream(file)) {
            os.write(bytes);
        }

        return path.toString();
    }

    public String getRootDir(){
        return rootDir;
    }
}
