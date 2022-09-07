package com.example.hibernate.demoHibernate.services;

import java.util.HashSet;
import java.util.List;

import com.example.hibernate.demoHibernate.configuration.EntityPojo;
import com.example.hibernate.demoHibernate.dao.SpringDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SpringServices {
	
	
	@Autowired
	SpringDao sd;
	
	public List<EntityPojo> getStaff(){
		List<EntityPojo> list=sd.getStaff();
		return list;
	}
	

}
