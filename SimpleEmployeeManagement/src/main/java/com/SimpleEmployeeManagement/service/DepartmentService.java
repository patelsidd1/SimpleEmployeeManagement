package com.SimpleEmployeeManagement.service;

import com.SimpleEmployeeManagement.repo.DeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DeptRepo deptRepo;



}
