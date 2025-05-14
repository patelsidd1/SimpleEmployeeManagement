package com.SimpleEmployeeManagement.repo;

import com.SimpleEmployeeManagement.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeptRepo extends JpaRepository<Department,Long> {

    @Query("SELECT d.name, COUNT(e.id) FROM Department d LEFT JOIN Employee e ON e.department = d GROUP BY d.name")
    List<Object[]> getDepartmentsWithEmployeeCount();

}
