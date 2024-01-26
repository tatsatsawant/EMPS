package dev.tatsat.payroll.EmployeePayrollSystem.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}