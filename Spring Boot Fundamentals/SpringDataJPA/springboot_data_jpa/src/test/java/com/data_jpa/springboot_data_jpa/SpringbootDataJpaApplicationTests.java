package com.data_jpa.springboot_data_jpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.data_jpa.springboot_data_jpa.entities.Student;
import com.data_jpa.springboot_data_jpa.repos.StudentRepository;

@SpringBootTest
class SpringbootDataJpaApplicationTests {

	@Autowired
	private StudentRepository repository;

	@Test
	void TestSaveStudent() {
		Student student = new Student();
		student.setId(1l);
		student.setName("Bharath");
		student.setTestScore(100);
		repository.save(student);

		Student savedStudent = repository.findById(1l).get();
		assertNotNull(savedStudent);
	}

}
