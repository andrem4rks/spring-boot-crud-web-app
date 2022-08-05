package marks.java.springcrudwebapp.service;

import java.util.List;

import marks.java.springcrudwebapp.model.Employee;

public interface EmployeeService {
  List<Employee> getAllEmployees();
  void saveEmployee(Employee employee);
  Employee getEmployeeById(long id); 
  void deleteEmployeeById(long id);
}
