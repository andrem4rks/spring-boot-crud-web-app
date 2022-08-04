package marks.java.springcrudwebapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marks.java.springcrudwebapp.model.Employee;
import marks.java.springcrudwebapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;
  
  @Override
  public List<Employee> getAllEmployees() {
    return employeeRepository.findAll();
  }
}
