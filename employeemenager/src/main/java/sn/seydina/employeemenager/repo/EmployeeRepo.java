package sn.seydina.employeemenager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.seydina.employeemenager.model.Employee;

import java.util.Optional;


public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmpoyeeById(Long id);

      Optional<Employee> findEmployeeById(Long id);
}
 