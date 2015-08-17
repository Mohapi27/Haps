/**
 * 
 */
package com.accenture.strutsmvc.controller;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.accenture.strutsmvc.model.Employee;
import com.accenture.strutsmvc.util.HibernateUtil;

/**
 * @author m.s.mokoena
 *
 */
public class EmployeeCont{

	
	Session session = null;
	
	public String addEmployee(Employee emp) {
		
		String retValue = "";
		try{
			   System.out.println("Open session");
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.save(emp);
		      session.getTransaction().commit();
		      session.close();
		      System.out.println("Close session");
		      retValue = "SUCCESS";
		}
		catch(Exception ex)
		{
			System.err.println("Session not successful");
			ex.printStackTrace();
			retValue = "ERROR";
		}
		
		return retValue;
	}
}
