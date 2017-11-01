package com.sower.rdbms.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sower.rdbms.util.HibernateUtil;

public class EmployeeDetails {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session hsession = sf.openSession();
		Transaction tx = hsession.beginTransaction();
		Employee emp = new Employee();
//		emp.setId(4);
//		emp.setName("efour");
		hsession.save(emp);
		tx.commit();
		hsession.close();
		sf.close();
		
	}

}
