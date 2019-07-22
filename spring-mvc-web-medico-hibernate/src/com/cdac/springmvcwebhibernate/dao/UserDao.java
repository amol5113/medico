package com.cdac.springmvcwebhibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.cdac.springmvcwebhibernate.dto.Doctor;
import com.cdac.springmvcwebhibernate.dto.User;

@Repository	
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	public void save(final User user,Doctor doctor) {
		hibernateTemplate.execute(new HibernateCallback<List<User>>() {
			public List<User> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				session.save(user);
				//session.save(doctor);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
		});
		hibernateTemplate.execute(new HibernateCallback<List<Doctor>>() {
			public List<Doctor> doInHibernate(Session session) throws HibernateException {
				Transaction t = session.beginTransaction();
				//session.save(user);
				session.save(doctor);
				t.commit();
				session.flush();
				session.close();
				return null;
			}
		});
	}
}
