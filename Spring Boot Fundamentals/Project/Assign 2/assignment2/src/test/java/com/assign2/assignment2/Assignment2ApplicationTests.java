package com.assign2.assignment2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.assign2.assignment2.entities.Students;
import com.assign2.assignment2.repo.Repo;

@SpringBootTest
class Assignment2ApplicationTests {

	@Autowired
	private Repo repo;

	@Test
	void testCRUD() {
		Students students = new Students();
		students.setId(1l);
		students.setName("Test1");
		students.setTestScore(99);
		repo.save(students);
		assertNotNull(students);
		students.setName("switchOne");
		repo.save(students);
		assertNotNull(students);
		repo.delete(students);
	}

}
