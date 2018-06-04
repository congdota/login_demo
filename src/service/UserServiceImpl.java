package service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.User;
import util.HibernateUtil;

public class UserServiceImpl implements UserService{

	@Override
	public User getUser(String username, String password) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Query query = session.createQuery("From User");
			List<User> listUser = query.list();
			transaction.commit();
			return listUser;
			
		} catch (Exception e) {
			// TODO: handle exception
			if(!(transaction == null )) {
				transaction.rollback();
			}
		}
		session.close();
		return null;
	}

	
}
