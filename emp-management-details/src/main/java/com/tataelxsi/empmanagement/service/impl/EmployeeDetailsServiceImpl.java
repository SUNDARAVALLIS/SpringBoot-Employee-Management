package com.tataelxsi.empmanagement.service.impl;

import com.tataelxsi.empmanagement.model.EmployeeDetailsModel;
import com.tataelxsi.empmanagement.repository.EmployeeDetailsRepository;
import com.tataelxsi.empmanagement.service.EmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDetailsServiceImpl implements EmployeeDetailsService {

    @Autowired
    private EmployeeDetailsRepository employeeDetailsRepository;

    @Override
    public EmployeeDetailsModel getEmployeeDetails(Long id) {
        return employeeDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public List<EmployeeDetailsModel> getAllEmployees() {
        return employeeDetailsRepository.findAll();
    }

    @Override
    public String addEmployee(EmployeeDetailsModel employee) {
        employeeDetailsRepository.save(employee);
        return "Employee Added";
    }

    @Override
    public String updateEmployee(Long id, EmployeeDetailsModel updatedEmployee) {
        if (employeeDetailsRepository.existsById(id)) {
            updatedEmployee.setId(id);
            employeeDetailsRepository.save(updatedEmployee);
            return "Update Success";
        } else {
            return "Employee not found for update";
        }
    }

    @Override
    public String deleteEmployee(Long id) {
        if (employeeDetailsRepository.existsById(id)) {
            employeeDetailsRepository.deleteById(id);
            return "Delete Success";
        } else {
            return "Employee not found for delete";
        }
    }
}