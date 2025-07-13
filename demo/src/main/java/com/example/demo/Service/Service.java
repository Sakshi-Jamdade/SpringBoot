package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Student;
import com.example.demo.Repository.Repository;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Repository repo;
	
	public void addProduct()
	{
		Student s=new Student("Tejas", "Jadhav");
		Student save = repo.save(s);
	}

	

}
