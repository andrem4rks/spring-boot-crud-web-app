package marks.java.springcrudwebapp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import marks.java.springcrudwebapp.model.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
  
