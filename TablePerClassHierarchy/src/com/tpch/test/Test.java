package com.tpch.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpch.entities.Payment;
import com.tpch.utility.SessionFactoryRegistry;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionfactory = null;
		Session session = null;
		Transaction transaction = null;
		Boolean flag = false;
		Payment payment;
		
		try {
			sessionfactory = SessionFactoryRegistry.getMysqlsessionFactory();
			session = sessionfactory.openSession();
			transaction = session.beginTransaction();
			
			payment = new Payment();
			payment.setPaymentDate(new Date());
			payment.setDescription("Payment Succesfull");
			payment.setAmount(500.0);
			session.save(payment);
			
			flag = true;
		} finally {
			if(transaction != null) {
				if(flag)
				{
					transaction.commit();
				}else
				{
					transaction.rollback();
				}
			}
		}		
	}

}
