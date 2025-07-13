package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Repository.Repository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner
{
	public static void main(String[] args) 
	{
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	Repository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Student s=new Student("Sakshi", "Talegaon");
//		Student s1=new Student("Shreyas", "Khatav");
//		Student s2=new Student("Suraj", "Morgaon");
//		List<Student> saveAll = repo.saveAll(Arrays.asList(s,s1,s2));
//		System.out.println("Data Saved Succesfully");
//		System.err.println(saveAll);
		
//		Optional<Student> byId = repo.findById(5);
//		if(byId.isPresent())
//		{
//			System.out.println(byId);
//		}
//		else
//		{
//			System.out.println("Data is not found");
//		}
		
		
		
		
		
	}
}
