package com.SimpleEmployeeManagement.controller;

import com.SimpleEmployeeManagement.entities.Employee;
import com.SimpleEmployeeManagement.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmpController {

    @Autowired
    EmpService empService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){

        Employee save = empService.save(employee);
        return save;

    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        Optional<Employee> byId = empService.findById(id);
        return byId;

    }

    @GetMapping
    public List<Employee> getAllEmployee(){
        List<Employee> allEmployee = empService.getAllEmployee();
        return allEmployee;

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        empService.deleteById(id);

        return ResponseEntity.noContent().build();

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee ) {

    return ResponseEntity.ok(empService.updateEmployee(id, employee));

    }

}
