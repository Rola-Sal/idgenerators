package com.idgenerators.idgenerators;

import com.idgenerators.idgenerators.entities.Employee;
import com.idgenerators.idgenerators.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class IdgeneratorsApplicationTests {

	@Autowired
	EmployeeRepository repository;

	@Test
	public void testCreat() {
		Employee employee = new Employee();
		employee.setName("Rola Salahat");
		repository.save(employee);
	}

}
