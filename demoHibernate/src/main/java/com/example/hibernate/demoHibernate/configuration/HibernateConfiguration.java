package com.example.hibernate.demoHibernate.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
	
	public static SessionFactory getSession() {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(EntityPojo.class);
		SessionFactory sf=cfg.buildSessionFactory();
		return sf;
	}

}
