package com.tka.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.Entity.Teacher;

@Repository
public class TeacherDao {

	@Autowired
	SessionFactory sessionFactory;

	public Teacher fetchTeacher(int teaId) {
		Session session = sessionFactory.openSession();
		System.err.println("I have reached the DAO layer");
		Teacher teacher = session.load(Teacher.class, teaId);
		System.out.println(teacher);
		// session.close();
		return null;
	}

	public void insertdata() {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Teacher teacher = new Teacher();
		teacher.setTeaname("Mathematics");
		teacher.setTeaCapacity(900);
		teacher.setTeaLocation("pune");
		session.save(teacher);
		
		Teacher teacher1 = new Teacher();
		teacher1.setTeaname("Shubham");
		teacher1.setTeaCapacity(800);
		teacher1.setTeaLocation("Latur");
		session.save(teacher1);
		 
		Teacher teacher2 = new Teacher();
		teacher2.setTeaname("Sahil");
		teacher2.setTeaCapacity(500);
		teacher2.setTeaLocation("Amaravati");
		session.save(teacher2);
		
		transaction.commit();
		System.err.println("Inserted Teacher: " + teacher);
		session.close();

	}

	public void updateData(int TeaId) {
	    Session session = sessionFactory.openSession();
	    Transaction transaction = null;

	    try {
	        transaction = session.beginTransaction();
	        Teacher teacher = session.get(Teacher.class, TeaId);
	        teacher.setTeaname("Vaishnavi");
	        session.update(teacher);
	        System.out.println("Data updated successfully! " + teacher);
             transaction.commit();
	    } catch (org.hibernate.ObjectNotFoundException e) {
	            transaction.rollback();
	            session.close();
	        }
	    }

	public void deleteData(int TeaId) {
		Session session = sessionFactory.openSession();
	    Transaction transaction = null;
	    try {
	        transaction = session.beginTransaction();
	        Teacher teacher = session.get(Teacher.class, TeaId);
	        teacher.setTeaname("sahil"); 
	        session.delete(teacher);
	        System.out.println("Data updated successfully! " + teacher);
             transaction.commit();
	    } catch (org.hibernate.ObjectNotFoundException e) {
	            transaction.rollback();
	            session.close();
	        }

		
	} 

}
