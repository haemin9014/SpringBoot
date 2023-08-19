package com.assign2.assignment2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assign2.assignment2.entities.Students;

public interface Repo extends JpaRepository<Students, Long>{
    
}
