package hpe.example.task2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hpe.example.task2.model.Employee;
//import hpe.example.task2.model.Employees;
import hpe.example.task2.service.EmployeesManager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/employees")
public class EmployeesController {
    private final EmployeesManager employeesManager;

    public EmployeesController(EmployeesManager employeesManager){
        this.employeesManager = employeesManager;
    }

    @GetMapping()
    public Map<String, Object> getEmployeesDetails() { 
        Map<String, Object> response = new HashMap<>();
        response.put("employees", employeesManager.getEmployees().getEmployees());
        return response;
    }  

    @PostMapping("/post")
    public Map<String,String> postEmployees(@RequestBody List<Employee> entity) {
        employeesManager.setEmployees(entity);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Employees added successfully!");
        return response;
    }
    
}
