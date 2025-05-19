package com.javadev.fileoperations.repository;

import com.javadev.fileoperations.entity.FileOperationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileOperationRepository extends JpaRepository<FileOperationLog,Long> {
}
