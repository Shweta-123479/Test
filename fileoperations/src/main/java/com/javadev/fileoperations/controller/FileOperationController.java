package com.javadev.fileoperations.controller;


import com.javadev.fileoperations.service.FileOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/files")
public class FileOperationController {

    @Autowired
    private FileOperationService fileOperationService;
    /**
     * This method creates a file with the given name.
     * @param fileName
     * @return
     */
    @PostMapping("/create")
    public ResponseEntity<String> createFile(@RequestParam String fileName) {
        fileOperationService.createFile(fileName);
        return ResponseEntity.ok("File created successfully "+ fileName);
    }

    /**
     * This method deletes a file with the given name.
     * @param fileName
     * @return
     */
    @PostMapping("/delete")
    public ResponseEntity<String> deleteFile(@RequestParam String fileName)
    {
        fileOperationService.deleteFile(fileName);
        return ResponseEntity.ok("File deleted successfully " + fileName);
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam String sourcePath,
                                             @RequestParam String destinationPath,
                                             @RequestParam String fileName) {
        fileOperationService.uploadFile(sourcePath, destinationPath, fileName);
        return ResponseEntity.ok("File uploaded successfully " + fileName);
    }
}
