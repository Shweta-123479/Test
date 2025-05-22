package com.javadev.fileoperations.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(FileOperationException.class)
    public ResponseEntity<ErrorResponse> handleFileOperationException(FileOperationException ex, WebRequest webRequest) {
        ErrorResponse response = new ErrorResponse(LocalDateTime.now(),
                ex.getMessage(), webRequest.getDescription(false), HttpStatus.BAD_REQUEST.toString());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception ex, WebRequest request) {
        ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
               "An unexpected error occurred",
                request.getDescription(false),
                HttpStatus.INTERNAL_SERVER_ERROR.toString()
        );
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
