package com.API.test.Controller;

import com.API.test.entity.Department;
import com.API.test.error.DepartmentNotFoundException;
import com.API.test.service.DepartmentService;
import com.API.test.service.DepartmentServiceImpl;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final org.slf4j.Logger Logger= LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        Logger.info("Insider saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList(){
        Logger.info("Insider fetchDepartment of DepartmentController");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/students/{id}")
    public String deleteDepartmentById(@PathVariable ("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted";

    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name")String departmentName ){
    return departmentService.fetchDepartmentByName(departmentName);
    }

}
