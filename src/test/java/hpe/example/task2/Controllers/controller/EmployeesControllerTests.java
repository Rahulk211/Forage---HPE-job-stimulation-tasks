package hpe.example.task2.Controllers.controller;

import static org.mockito.Mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import hpe.example.task2.controller.EmployeesController;
import hpe.example.task2.model.Employee;
import hpe.example.task2.model.Employees;
import hpe.example.task2.service.EmployeesManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class EmployeesControllerTests {

    @Mock
    private EmployeesManager employeesManager;

    @InjectMocks
    private EmployeesController employeesController;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetEmployeesDetails() {
        List<Employee> employeeslist = List.of(
            new Employee("E004", "Bob", "Marley", "bob.marley@example.com", "QA Engineer"),
            new Employee("E005", "Alice", "Wonderland", "alice.w@example.com", "DevOps Engineer")
        );

        Employees employees = new Employees(employeeslist);

        when(employeesManager.getEmployees()).thenReturn(employees);

        var response = employeesController.getEmployeesDetails();

        assertNotNull(employees);
        assertTrue(response.containsKey("employees"));
        assertEquals(2,((List<?>) response.get("employees")).size());
    }

    @Test
    void testPostEmployeesDetail(){
        List<Employee> employees = List.of(
            new Employee("E003", "Alice", "Johnson", "alice.johnson@example.com", "UX Designer")
        );

        employeesController.postEmployees(employees);

        assertDoesNotThrow(()-> employeesController.postEmployees(employees));
    }
}

