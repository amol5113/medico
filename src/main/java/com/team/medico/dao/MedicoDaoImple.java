package com.team.medico.dao;


import java.util.Date;
import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import com.team.medico.model.Admin;
import com.team.medico.model.Doctor;
import com.team.medico.model.History;
import com.team.medico.model.Patient;
import com.team.medico.model.PreferredLanguage;
import com.team.medico.model.User;

import java.util.List;


@Repository
public class MedicoDaoImple implements MedicoDao {

	@Autowired
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
	
	


	@SuppressWarnings("unchecked")
	@Override
	public boolean validateUser(User user) {
		Session session = this.sessionFactory.openSession();
		Query q = session.createQuery("from User where emailId = ? and password = ?");
		q.setString(0, user.getEmailId());
		q.setString(1, user.getPassword());
		List<User> userList = q.list();
		session.close();
		if(!userList.isEmpty()) {
			return true;
		}
		return false;
	}
	
	//@SuppressWarnings("unchecked")
	@Override
	public User getUserByEmailId(String emailId) {
		Session session = this.sessionFactory.openSession();
		User user = (User)session.get(User.class,emailId);
		session.close();
		return user;
	}
	
	@Override
	public void savePatient(final Patient patient) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(patient);
		tx.commit();
		session.close();
	}
	
	@Override
	public void saveUser(final User user) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(user);
		tx.commit();
		session.close();
	}

	//@Scheduled(fixedRate = 5000)
	public void demoServiceMethod()
    {
        System.out.println("Method executed at every 5 seconds. Current time is :: "+ new Date());
    }



	@Override
	public PreferredLanguage getLanguageById(String languageId) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		PreferredLanguage preferredLanguage = (PreferredLanguage)session.get(PreferredLanguage.class,languageId);
		tx.commit();
		session.close();
		return preferredLanguage;
	}
	
	public void savePref(PreferredLanguage preferredLanguage) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(preferredLanguage);
		tx.commit();
		session.close();
	}

	@Override
	public void insertDoctor(Doctor doctor, User user) {
		Session session = this.sessionFactory.openSession();
		Transaction t = session.beginTransaction();
				
				session.save(user);
				session.save(doctor);
				t.commit();
				session.close();
		
	}



	@Override
	public void saveHistory(History history) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(history);
		tx.commit();
		session.close();
	}





	@Override
	public void saveAdmin(Admin admin) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(admin);
		tx.commit();
		session.close();
		
	}
	
	@Override
	public List<Doctor> getAllDoctor() {
		Session session = this.sessionFactory.openSession();
		Query q = session.createQuery("from Doctor");
		List<Doctor> doctorList = q.list();
		session.close();
		if(!doctorList.isEmpty()) {
			return doctorList;
		}
		return null;
	}

	@Override
	public Doctor getDoctor1(String email) {
		Session session = this.sessionFactory.openSession();
		Query q = session.createQuery("from Doctor where email_id=?");
		q.setString(0, email);
		q.setMaxResults(1);
		Doctor doctor =(Doctor) q.uniqueResult();
		
		session.close();
		if(doctor!=null) {
			return doctor;
		}
		return null;
	}


	@Override
	public List<Patient> getAllPatient() {
		Session session = this.sessionFactory.openSession();
		Query q = session.createQuery("from Patient");
		List<Patient> patientList = q.list();
		session.close();
		if(!patientList.isEmpty()) {
			return patientList;
		}
		return null;
	}


	@Override
	public Doctor approveDoctor(String email) {
		Session session = this.sessionFactory.openSession();
		Query q = session.createQuery("update Doctor d set d.status='Approved' where d.emailId=?");
		q.setParameter(0, email);
		int count = q.executeUpdate();
		
		
		session.close();
		if(count > 0) {
			
			return null;
		}
		return null;
	}

	@Override
	public Doctor deleteDoctor(String email) {
		Session session = this.sessionFactory.openSession();
		Query q = session.createQuery("update User u set u.isActive='inactive' where u.emailId=?");
		q.setParameter(0, email);
		int count = q.executeUpdate();
		
		session.close();
		if(count > 0) {
			
			return null;
		}
		return null;
	}

}

	

//@Transactional
//@Repository
//public class MedicoDaoImple extends AbstractDao<Integer, User> implements MedicoDao {
//
//	
//	@SuppressWarnings("unchecked")
//	@Override
//	public boolean validateUser(final User user) {
//		
//		
//		try {
//		Session session = getSession();
//
//		Transaction tx = session.getTransaction();
//		
//				Query q = session.createQuery("from User where userName = ? and password = ?");
//				q.setString(0, user.getUserName());
//				q.setString(1, user.getPassword());
//				List<User> userList = q.list();
//				if(!tx.wasCommitted()) {
//				tx.commit();
//				}
//				System.out.println("here");
//		if(!userList.isEmpty()) {
//			return true;
//		}	
//		return false;
//		}catch(Exception e) {
//			System.out.println(e.getStackTrace());
//			return false;
//		}
//	}
//	
//	
//}

