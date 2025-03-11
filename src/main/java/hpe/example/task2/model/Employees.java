package hpe.example.task2.model;

import java.util.ArrayList;
import java.util.List;
// import hpe.example.task2.model.Employee;

public class Employees {
    List<Employee> employees;

    public Employees(){
        employees = new ArrayList<>();
    }

    public Employees(List<Employee> employees){
        this.employees = employees;
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    // public void setEmployees(List<Employee> employees){
    //     this.employees = employees;
    // }
}
