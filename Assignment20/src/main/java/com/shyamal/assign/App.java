package com.shyamal.assign;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.shyamal.model.Student;
import com.shyamal.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unchecked")
	public static void main( String[] args ) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
    {
    	Session session=null;
    	int count = 0;

		org.hibernate.Transaction transaction = null;
    	boolean flag=false;
    	try
    {
    	
    	   session=HibernateUtil.getSession();
    	   transaction=session.beginTransaction();
    	   Query<Student> query=session.createQuery("update com.shyamal.model.Student SET sage=sage+:qty where sname=:name");
    	     query.setParameter("qty", 20);
    	     query.setParameter("name", "ram");
    		// Execute the query
			   count=query.executeUpdate();
			  flag = true;
    } catch (HibernateException he) {
		he.printStackTrace();
		flag =false;
	} finally {
		if (flag) {
			transaction.commit();
			System.out.println("No of rows affected is :: " + count);
		} else {
			transaction.rollback();
			System.out.println("No of rows affected is :: " + count);

		}
		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}

}
}
