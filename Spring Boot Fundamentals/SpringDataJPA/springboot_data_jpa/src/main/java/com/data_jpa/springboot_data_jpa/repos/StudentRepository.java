package com.data_jpa.springboot_data_jpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.data_jpa.springboot_data_jpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
