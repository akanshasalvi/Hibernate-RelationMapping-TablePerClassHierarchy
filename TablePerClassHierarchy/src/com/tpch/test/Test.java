package com.tpch.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tpch.entities.ChequePayment;
import com.tpch.entities.DigitalPayment;
import com.tpch.entities.Payment;
import com.tpch.utility.SessionFactoryRegistry;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionfactory = null;
		Session session = null;
		Transaction transaction = null;
		Boolean flag = false;
		Payment payment;
		ChequePayment cheque;
		DigitalPayment digital;
		
		try {
			sessionfactory = SessionFactoryRegistry.getMysqlsessionFactory();
			session = sessionfactory.openSession();
			transaction = session.beginTransaction();
			
						
			/*cheque = new ChequePayment();
			cheque.setPaymentDate(new Date());
			cheque.setDescription("Transaction Completed");
			cheque.setAmount(600);
			cheque.setChequeNo("CHQ001");
			cheque.setBankName("Axis Bank");
			cheque.setBranchName("Shivajinagar");
			cheque.setIfscCode("AXIS1234");
			session.save(cheque);
			*/
			
			/*digital = new DigitalPayment();
			digital.setPaymentDate(new Date());
			digital.setDescription("Transaction Completed");
			digital.setAmount(600);
			digital.setPartnerName("GPay");
			digital.setTxNo("GPay001");
			digital.setRemarks("Gift card");
			session.save(digital);*/
			
			/*payment = session.get(Payment.class, 1);  
			System.out.println(payment);*/
			
			/*payment = session.get(Payment.class, 2);  --> Polymorphic retrival based on ID
			System.out.println(payment);
			*/
			
			/*payment = session.get(Payment.class, 3);  --> Polymorphic retrival based on ID
			System.out.println(payment);*/
			
			cheque = (ChequePayment)session.get(ChequePayment.class, 2);
			System.out.println(cheque);
			
			digital = session.get(DigitalPayment.class, 3);
			System.out.println(digital);
			
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
