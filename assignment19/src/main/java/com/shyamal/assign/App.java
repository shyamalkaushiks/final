package com.shyamal.assign;




import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.shyamal.model.Student;
import com.shyamal.model.Studentdetails;
import com.shyamal.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
		try {
			//session = HibernateUtil.getSession();
			session=HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {

				Studentdetails student = new Studentdetails();
				student.setSid(262);
				student.setDname("ram");
				student.setSaddress("mumbai");
				student.setEage(40);

				session.save(student);
				flag = true;
				Studentdetails s=session.get(Studentdetails.class, 200);
				System.out.print(s);
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				System.out.println("Object saved to database....");
			} else {
				transaction.rollback();
				System.out.println("Object not saved to database...");
			}

			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}


	}

}
