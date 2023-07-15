package com.realit.realits.service;

import com.realit.realits.model.Employee;
import com.realit.realits.repository.CompanyRepository;
import com.realit.realits.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final CompanyRepository companyRepository;


    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee updateEmployee(Integer id, Employee employee) {
        Employee existingEmployee = employeeRepository.findById(id).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setFirstName(employee.getFirstName());
            existingEmployee.setLastName(employee.getLastName());
            existingEmployee.setEmail(employee.getEmail());
            return employeeRepository.save(existingEmployee);
        } else {
            return null;
        }
    }

    public boolean deleteEmployee(Integer id) {
        Employee employee = employeeRepository.findById(id).orElse(null);
        if (employee != null) {
            employeeRepository.delete(employee);
            return true;
        } else {
            return false;
        }
    }

    public List<Employee> allEmployees() {
        return employeeRepository.findAll();
    }
}

