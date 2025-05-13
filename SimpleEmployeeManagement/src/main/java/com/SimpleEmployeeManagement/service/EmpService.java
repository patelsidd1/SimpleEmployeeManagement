package com.SimpleEmployeeManagement.service;

import com.SimpleEmployeeManagement.entities.Employee;
import com.SimpleEmployeeManagement.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    EmpRepo empRepo ;

    public Optional<Employee> findById(Long id ){
        Optional<Employee> byId = empRepo.findById(id);
        return byId;
    }

    public Employee save(  Employee employee){

        Employee save = empRepo.save(employee);
        return save;

    }

    public List<Employee> getAllEmployee(){
        List<Employee> empRepoAll = empRepo.findAll();
        return empRepoAll;
    }

    public void deleteById(Long id){
        empRepo.deleteById(id);
    }

    public Employee updateEmployee(Long id, Employee employeeDetails){
        Employee employee = empRepo.findById(id).orElseThrow(() -> new RuntimeException("Employee not found "));
        employee.setName(employeeDetails.getName());
        employee.setDepartment(employeeDetails.getDepartment());
        employee.setSalary(employeeDetails.getSalary());
        employee.setJoiningDate(employeeDetails.getJoiningDate());

        return empRepo.save(employee);
    }
}
