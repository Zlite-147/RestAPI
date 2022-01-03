package com.example.zlite.demo.service;

import java.util.List;

import com.example.zlite.demo.entity.Employee;

public interface EmployeeServiceInterface {

	public Employee addEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmpById(Long empidL);

	public void deleteEmpById(Long empidL);

}