package com.example.transaction.Employee.Exception;

public class EmployeeAlreadyExistsException extends RuntimeException{
    public EmployeeAlreadyExistsException(String message){
        super(message);
    }
}
