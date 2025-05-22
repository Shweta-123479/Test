package com.javadev.fileoperations.exceptions;

import java.time.LocalDateTime;

public class ErrorResponse {

    private LocalDateTime timestamp;
    private String message;
    private String details;
    private String status;

    public ErrorResponse()
    {

    }
    public ErrorResponse(LocalDateTime timestamp, String message, String details, String status) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.status = status;
    }

    // create all getter and setters

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "timestamp=" + timestamp +
                ", message='" + message + '\'' +
                ", details='" + details + '\'' +
                ", status='" + status + '\'' +
                '}';
    }


}
