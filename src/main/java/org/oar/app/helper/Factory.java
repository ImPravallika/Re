package org.oar.app.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {
	public static SessionFactory sf;
	public static SessionFactory getFactory()
	{
		
		if(sf==null)
		{
			sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sf;
	}
	

}
