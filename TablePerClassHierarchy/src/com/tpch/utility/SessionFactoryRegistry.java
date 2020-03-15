package com.tpch.utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionFactoryRegistry {
	private static SessionFactory mysqlsessionFactory;
	static
	{
		try
		{
			mysqlsessionFactory=new MetadataSources(new StandardServiceRegistryBuilder().configure().build()).buildMetadata().buildSessionFactory();
		}
		catch (Throwable t)
		{
			t.printStackTrace();
			throw t;
		}
	}
	public static final SessionFactory getMysqlsessionFactory()
	{
		return mysqlsessionFactory;
	}
	public static void closesessionFactory()
	{
		if(mysqlsessionFactory!=null)
		{
			mysqlsessionFactory.close();
		}
	}
}
