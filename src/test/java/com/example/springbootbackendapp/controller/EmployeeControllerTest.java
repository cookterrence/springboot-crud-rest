package com.example.springbootbackendapp.controller;
import com.example.springbootbackendapp.model.Employee;
import com.example.springbootbackendapp.service.EmployeeService;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {
    @Mock
    private EmployeeService empoyeeService;
    @InjectMocks
    private EmployeeController employeeController;
    @Before
    public void setup(){
        Employee e1 = new Employee();
        e1.setFirstName("John");
        e1.setLastName("Cena");
        e1.setEmail("random.gmail.com");

        Employee e2 = new Employee();
        e2.setFirstName("Steve");
        e2.setLastName("Austin");
        e2.setEmail("stoneCold@gmail.com");
        List<Employee> elist = new ArrayList<>();
        elist.add(e1);
        elist.add(e2);
        when(this.empoyeeService.getAllEmployees()).thenReturn(elist);
     }
     @Test
    public void getAllEmployeesHappy(){
        List<Employee> response = this.employeeController.getAllEmployees();
         Employee e1 = new Employee();
         e1.setFirstName("John");
         e1.setLastName("Cena");
         e1.setEmail("random.gmail.com");

         Employee e2 = new Employee();
         e2.setFirstName("Steve");
         e2.setLastName("Austin");
         e2.setEmail("stoneCold@gmail.com");
         List<Employee> elist = new ArrayList<>();
         elist.add(e1);
         elist.add(e2);
        assertEquals(response, elist);
     }
}
