package com.tataelxsi.empmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tataelxsi.empmanagement.model.EmployeeDetailsModel;
import com.tataelxsi.empmanagement.service.EmployeeDetailsService;

@RestController
@RequestMapping("/employees")
public class EmployeeDetailsController {

    @Autowired
    private EmployeeDetailsService employeeDetailsService;

    @GetMapping("/display/{id}")
    public EmployeeDetailsModel getEmployeeFromDatabase(@PathVariable Long id) {
        return employeeDetailsService.getEmployeeDetails(id);
    }

    @GetMapping("/display/all")
    public List<EmployeeDetailsModel> getAllEmployeesFromDatabase() {
        return employeeDetailsService.getAllEmployees();
    }

    @PostMapping("/create/new")
    public String addEmployeesToDatabase(@RequestBody List<EmployeeDetailsModel> employees) {
        for (EmployeeDetailsModel employee : employees) {
            employeeDetailsService.addEmployee(employee);
        }
        return "Employees Added";
    }

    @PutMapping("/update/{id}")
    public String updateEmployeeById(@PathVariable Long id, @RequestBody EmployeeDetailsModel employee) {
        return employeeDetailsService.updateEmployee(id, employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployeeById(@PathVariable Long id) {
        return employeeDetailsService.deleteEmployee(id);
    }
}