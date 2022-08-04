package marks.java.springcrudwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import marks.java.springcrudwebapp.model.Employee;
import marks.java.springcrudwebapp.repository.EmployeeRepository;


public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;
  
  @Override
  public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
  }
}
