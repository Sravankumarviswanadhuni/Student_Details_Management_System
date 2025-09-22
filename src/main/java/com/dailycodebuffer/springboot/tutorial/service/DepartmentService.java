package com.dailycodebuffer.springboot.tutorial.service;

import com.dailycodebuffer.springboot.tutorial.entity.Department;
import com.dailycodebuffer.springboot.tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public List<Department> fetchDepartmentList();

    public Department saveDepartment(Department department);

    public Department findDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteElementById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
