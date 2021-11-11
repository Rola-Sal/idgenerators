package com.idgenerators.idgenerators.repos;

import com.idgenerators.idgenerators.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee , Long > {
}
