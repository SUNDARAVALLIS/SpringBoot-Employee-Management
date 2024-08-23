package com.tataelxsi.empmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.tataelxsi.empmanagement.repository")
@EntityScan("com.tataelxsi.empmanagement.model")
public class EmpManagementDetailsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpManagementDetailsApplication.class, args);
    }

}

