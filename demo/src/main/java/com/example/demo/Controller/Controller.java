package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student;
import com.example.demo.Repository.Repository;
import com.example.demo.Service.Service;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	Service ser;
	
	
	@GetMapping("/save")
	public String addProduct()
	{
		ser.addProduct();
		
		return "Data added succesfully..";
	}
	
	

}
