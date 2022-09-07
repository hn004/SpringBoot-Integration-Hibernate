package com.example.hibernate.demoHibernate.controller;

import java.util.HashSet;
import java.util.List;

import com.example.hibernate.demoHibernate.configuration.EntityPojo;
import com.example.hibernate.demoHibernate.services.SpringServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OperationController {

	@Autowired
	SpringServices ss ;
	
	@GetMapping("work")
	public String Working() {
		return "Working ok";
	}
	
	@GetMapping("getstaffrecord")
	List<EntityPojo> getStaff() {
		List<EntityPojo> list =	ss.getStaff();
		return list;
	}
}
