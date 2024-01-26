package dev.tatsat.payroll.EmployeePayrollSystem.service;

import dev.tatsat.payroll.EmployeePayrollSystem.model.Payroll;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PayrollService {

    List<Payroll> getAllPayrolls();

    Payroll getPayrollByEmployeeIdAndPayPeriod(Long employeeId, String payPeriod);

    List<Payroll> getPayrollByEmployeeId(Long employeeId);

    Payroll addPayroll(Long employeeId, Payroll payroll);

    Payroll updatePayroll(Long payrollId, Payroll payrollDetails);
}