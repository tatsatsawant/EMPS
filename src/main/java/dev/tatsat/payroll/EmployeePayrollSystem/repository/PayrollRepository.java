package dev.tatsat.payroll.EmployeePayrollSystem.repository;

import dev.tatsat.payroll.EmployeePayrollSystem.model.Payroll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PayrollRepository extends JpaRepository<Payroll, Long> {

    List<Payroll> findByEmployeeId(Long employeeId);

    Payroll findByEmployeeIdAndPayPeriod(Long employeeId, String payPeriod);


    Boolean existsByPayPeriod(String payPeriod);

}
