package hpe.example.task2.service;

// import hpe.example.task2.Employees;
// import hpe.example.task2.Employee;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import hpe.example.task2.model.Employee;
import hpe.example.task2.model.Employees;

@Service
public class EmployeesManager {
    private final Employees employees;

    public EmployeesManager(){
        List<Employee> employeelist = Arrays.asList(
            new Employee("A110", "Rahul", "Sharma", "xyz@gmail.com", "SDE"),
            new Employee("A111", "abcd", "kapoor", "abd@gmail.com", "SDE02"),
            new Employee("A105", "pqr", "kumar", "pqr@gmail.com", "NET E"),
            new Employee("A118", "rst", "Sharma", "rst@gmail.com", "web dev")
        );

        if (employeelist == null || employeelist.isEmpty()) {
            throw new IllegalArgumentException("Employee list cannot be null or empty");
        }

        // Validate each employee's data
        for (Employee emp : employeelist) {
            if (emp.getId() == null || emp.getId().isEmpty()) {
                throw new IllegalArgumentException("Employee ID cannot be null or empty");
            }
            if (emp.getmail() == null || emp.getmail().isEmpty()) {
                throw new IllegalArgumentException("Employee email cannot be null or empty");
            }
        }
        // Employees employees = new Employees(employeelist);
        this.employees = new Employees(employeelist);
    }

    public Employees getEmployees(){
        return this.employees;
    }

    public void setEmployees(List<Employee> newEmployees){
        employees.getEmployees().addAll(newEmployees);
    }
}
