package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.Student;


public interface Repository extends JpaRepository<Student, Integer> {
	
	
	

}
