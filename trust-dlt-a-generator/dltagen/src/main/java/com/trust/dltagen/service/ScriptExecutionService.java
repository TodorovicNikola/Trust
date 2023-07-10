package com.trust.dltagen.service;

import com.trust.dltagen.exception.ScriptExecutionException;
import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

@Service
public class ScriptExecutionService {

    private final FileService fileService;

    public ScriptExecutionService(FileService fileService) {
        this.fileService = fileService;
    }

    public void execute(String scriptPath) {
        ProcessBuilder pb = new ProcessBuilder("/bin/sh", scriptPath);

        try {
            Process p = pb.start();
            p.waitFor();

            if(p.exitValue() != 0) {
                String message = null;
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(p.getErrorStream()));
                StringBuilder builder = new StringBuilder();
                while ( (message = reader.readLine()) != null) {
                    builder.append(message);
                    builder.append(System.getProperty("line.separator"));
                }

                throw new ScriptExecutionException(builder.toString());
            }

            String scriptName = (new File(scriptPath)).getName();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ( (line = reader.readLine()) != null) {
                builder.append(line);
                builder.append(System.getProperty("line.separator"));
            }
            String result = builder.toString();

            fileService.store(scriptName + "-" + (new Date()).toString() + ".log", result.getBytes(), "logs");

        } catch (IOException|InterruptedException e) {
            throw new ScriptExecutionException(e.getMessage());
        }
    }
}
