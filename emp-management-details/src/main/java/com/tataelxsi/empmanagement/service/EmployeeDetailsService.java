package com.tataelxsi.empmanagement.service;

import com.tataelxsi.empmanagement.model.EmployeeDetailsModel;

import java.util.List;

public interface EmployeeDetailsService {
    EmployeeDetailsModel getEmployeeDetails(Long id);
    List<EmployeeDetailsModel> getAllEmployees();
    String addEmployee(EmployeeDetailsModel employee);
    String updateEmployee(Long id, EmployeeDetailsModel employee);
    String deleteEmployee(Long id);
}