# Employee Payroll Management System

## Overview

The Employee Payroll Management System is a web application designed to manage employee information, payroll processing, and related functionalities. It provides a user-friendly interface for administrators to perform tasks such as adding employees, updating payroll information, and managing user roles.

## Features

- **Employee Management:** Add, update, and delete employee information.
- **Payroll Processing:** Calculate and manage employee payrolls based on salary information.
- **Security:** Implement user roles (admin, reader) with authentication and authorization.
- **Exception Handling:** Handle various exceptions, such as resource not found and validation errors.
- **RESTful API:** Expose APIs for employee and payroll operations.
- **Database Integration:** Utilize MySQL database for storing employee and payroll data.
- **Spring Boot:** Built using the Spring Boot framework for easy development and deployment.

## Technologies Used

- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Java
- RESTful APIs

## Project Structure

- **`src/main/java/dev/tatsat/payroll/EmployeePayrollSystem/controller`:** Contains REST controllers for handling HTTP requests.
- **`src/main/java/dev/tatsat/payroll/EmployeePayrollSystem/service`:** Implements business logic and interacts with repositories.
- **`src/main/java/dev/tatsat/payroll/EmployeePayrollSystem/repository`:** Provides interfaces for interacting with the database.
- **`src/main/java/dev/tatsat/payroll/EmployeePayrollSystem/model`:** Defines entity classes representing the database tables.
- **`src/main/java/dev/tatsat/payroll/EmployeePayrollSystem/exception`:** Manages custom exceptions and exception handlers.
- **`src/main/java/dev/tatsat/payroll/EmployeePayrollSystem/security`:** Configures Spring Security settings.

## Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/employee-payroll-system.git
   cd employee-payroll-system
