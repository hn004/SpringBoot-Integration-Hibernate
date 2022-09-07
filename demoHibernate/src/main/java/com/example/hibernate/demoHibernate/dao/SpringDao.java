package com.example.hibernate.demoHibernate.dao;

import java.util.HashSet;
import java.util.List;

import com.example.hibernate.demoHibernate.configuration.EntityPojo;
import com.example.hibernate.demoHibernate.configuration.HibernateConfiguration;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class SpringDao {
	
	
	public List<EntityPojo> getStaff() {
		SessionFactory factory = HibernateConfiguration.getSession();
        Session session=factory.openSession();
		Criteria criteria = session.createCriteria(EntityPojo.class);
		List<EntityPojo> list=criteria.list();
		System.out.println("Data = " + list);
		session.close();
		return list;
	}

}
