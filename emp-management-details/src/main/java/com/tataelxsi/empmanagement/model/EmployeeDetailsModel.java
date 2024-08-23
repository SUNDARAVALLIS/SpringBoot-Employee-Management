package com.tataelxsi.empmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class EmployeeDetailsModel {
    
    @Id
    @Column(name = "E_ID")
    private Long id;
    
    @Column(name = "E_NAME")
    private String name;
    
    @Column(name = "E_SALARY")
    private double salary;
    
    public EmployeeDetailsModel() {}
    
    public EmployeeDetailsModel(Long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
}