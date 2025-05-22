package com.javadev.fileoperations.service;

import com.javadev.fileoperations.entity.FileOperationLog;
import com.javadev.fileoperations.exceptions.FileOperationException;
import com.javadev.fileoperations.repository.FileOperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;

@Service
public class FileOperationService
{

    @Autowired
    private FileOperationRepository fileOperationRepository;

    @Value("${file.base.directory}")
    private String baseDir;

    public void log (String operation, String fileName, String source, String dest){
        FileOperationLog log = new FileOperationLog(fileName, operation, source, dest, LocalDateTime.now());
        fileOperationRepository.save(log);
    }

    public void createFile(String fileName) {
        try {
            Path filePath = Paths.get(baseDir, fileName);
            Files.createFile(filePath);

            log("CREATE", fileName, baseDir, null);

        } catch (FileAlreadyExistsException e) {
            throw new FileOperationException("File already exists " + fileName);
        } catch (IOException e) {
            throw new FileOperationException("Failed to create file " + fileName);
        }
    }


    public void deleteFile(String fileName)
    {
        try {
        Path file = Paths.get(baseDir,fileName);
        Files.delete(file);
        log("DELETE",fileName,baseDir,null);
        } catch (FileNotFoundException e) {
            throw new FileOperationException("File does not exists " + fileName);
        } catch (IOException e) {
            throw new FileOperationException("Failed to delete file " + fileName);
        }
    }

    public void uploadFile(String sourceFolder, String destinationFolder, String fileName)
    {
        Path sourcePath = Paths.get(sourceFolder, fileName);
        Path destinationPath = Paths.get(destinationFolder, fileName);
        try {
            Files.createDirectories(destinationPath.getParent());
            if(!Files.exists(sourcePath)) {
                throw new FileNotFoundException("Source file does not exist: " + sourcePath);
            }
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            log("UPLOAD", fileName, sourcePath.toString(), destinationPath.toString());

        } catch (FileOperationException e) {
            throw e;
        } catch (IOException e) {
            throw new FileOperationException("Failed to upload file " + fileName);
        }
    }

}
