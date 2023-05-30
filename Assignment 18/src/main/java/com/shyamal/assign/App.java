package com.shyamal.assign;

import java.util.List;

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
	public static void main( String[] args )
    {
    	Session session=null;
    	try
    {
    	
    	   session=HibernateUtil.getSession();
    	   Query<Student> query=session.createQuery("from com.shyamal.model.Student");
    		// Execute the query
			List<Student> products = query.list();

			// process the List Object
			products.forEach(System.out::println);

		} catch (HibernateException he) {
			he.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}

	}
}
