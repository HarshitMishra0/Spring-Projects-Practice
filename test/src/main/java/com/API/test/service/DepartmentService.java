package com.API.test.service;

import com.API.test.entity.Department;
import com.API.test.error.DepartmentNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

   public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);


   public Department fetchDepartmentByName(String departmentName);
}
