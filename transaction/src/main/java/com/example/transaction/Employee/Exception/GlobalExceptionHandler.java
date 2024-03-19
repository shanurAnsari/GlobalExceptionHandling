package com.example.transaction.Employee.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

@ExceptionHandler({EmployeeNotFoundException.class})
    public ResponseEntity<Object> handleEmployeeNotFoundException(EmployeeNotFoundException exception){
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(exception.getMessage());
}

@ExceptionHandler({EmployeeAlreadyExistsException.class})
    public ResponseEntity handleEmployeeAlreadyExistsException(EmployeeAlreadyExistsException exception){
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(exception.getMessage());
}

@ExceptionHandler({RuntimeException.class})
    public ResponseEntity<Object> handleRuntimException(RuntimeException exception){
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
            .body(exception.getMessage());
}
}
