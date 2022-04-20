package com.trust.dltagen.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.util.FileSystemUtils.deleteRecursively;

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

    public byte[] load(String path) throws IOException {
        Path filePath = Paths.get(getRootDir() + File.separator + path);
        return Files.readAllBytes(filePath);
    }

    public List<String> read(String path) throws IOException {
        Path filePath = Paths.get(getRootDir() + File.separator + path);
        List<String> ret = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filePath.toFile());
             BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {
            String line;
            while ((line = br.readLine()) != null) {
                ret.add(line);
            }
        }
        return ret;
    }

    public boolean delete(String ...directory) {
        Path path = Path.of(rootDir, directory);
        return deleteRecursively(path.toFile());
    }

    public String getRootDir(){
        return rootDir;
    }
}
