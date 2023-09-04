package com.example.aopdemo.controller;

import com.example.aopdemo.entity.Employee;
import com.example.aopdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("code")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("all")
    public ResponseEntity<List<Employee>> fetchAllEmployees(){
        return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
    }

    @PostMapping("add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.addEmployee(employee), HttpStatus.OK);
    }
}
