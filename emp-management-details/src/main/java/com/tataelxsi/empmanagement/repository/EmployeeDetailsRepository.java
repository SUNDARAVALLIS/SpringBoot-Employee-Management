package com.tataelxsi.empmanagement.repository;

import com.tataelxsi.empmanagement.model.EmployeeDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetailsModel, Long> {
    // Add custom query methods if needed
}
