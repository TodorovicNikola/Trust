package com.trust.dltagen.service;

import com.trust.dltagen.utils.FilesystemUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@Service
public class FileService {
    private final FilesystemUtil fsUtil;

    public FileService(FilesystemUtil filesystemUtil) {
        this.fsUtil = filesystemUtil;
    }

    public String store(MultipartFile multipartFile, String... directories) {
        return store(multipartFile.getOriginalFilename(), multipartFile, directories);
    }

    public String store(String filename, MultipartFile multipartFile, String... directories) {
        String filePath = "";
        try {
            filePath = fsUtil.saveToFile(multipartFile.getBytes(), filename, directories);
        } catch (IOException e) {
            //TODO: exception handling
            e.printStackTrace();
        }

        return filePath;
    }

    public String store(String filename, byte[] data, String... directories) {
        String filePath = "";
        try {
            filePath = fsUtil.saveToFile(data, filename, directories);
        } catch (IOException e) {
            //TODO: exception handling
            e.printStackTrace();
        }

        return filePath;
    }

    public String getRootDir() {
        return fsUtil.getRootDir();
    }

    public byte[] zipDir(String path) throws IOException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ZipOutputStream zipOut = new ZipOutputStream(bos);

        File fileToZip = new File(getRootDir() + "/" + path);
        zipFile(fileToZip, fileToZip.getName(), zipOut);
        zipOut.finish();
        zipOut.close();
        return bos.toByteArray();
    }

    private void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
        if (fileToZip.isHidden()) {
            return;
        }
        if (fileToZip.isDirectory()) {
            if (fileName.endsWith("/")) {
                zipOut.putNextEntry(new ZipEntry(fileName));
                zipOut.closeEntry();
            } else {
                zipOut.putNextEntry(new ZipEntry(fileName + "/"));
                zipOut.closeEntry();
            }
            File[] children = fileToZip.listFiles();
            for (File childFile : children) {
                zipFile(childFile, fileName + "/" + childFile.getName(), zipOut);
            }
            return;
        }

        try (FileInputStream fis = new FileInputStream(fileToZip)) {
            ZipEntry zipEntry = new ZipEntry(fileName);
            zipOut.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            zipOut.closeEntry();
        }
    }

    public boolean deleteDir(String ...directories) {
        return fsUtil.delete(directories);
    }

}
