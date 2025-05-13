package com.SimpleEmployeeManagement.repo;

import com.SimpleEmployeeManagement.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepo extends JpaRepository<Department,Long> {

}
