package com.javadev.fileoperations.service;

import com.javadev.fileoperations.entity.FileOperationLog;
import com.javadev.fileoperations.repository.FileOperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FileOperationService {

    @Autowired
    private FileOperationRepository fileOperationRepository;

    @Value("${file.base.directory}")
    private String baseDir;


    public void log(String operation, String fileName, String source, String dest) {
        FileOperationLog log = new FileOperationLog(fileName, operation, source, dest, LocalDateTime.now());
        fileOperationRepository.save(log);
    }
}
