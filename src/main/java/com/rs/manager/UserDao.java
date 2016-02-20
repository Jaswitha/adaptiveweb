package com.rs.manager;

import java.awt.print.Book;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rs.model.User;



public class UserDao {
	@Autowired
	SessionFactory sessionFactory;



	@Transactional
	public void saveUser(User user) throws HibernateException{
		Session session = sessionFactory.getCurrentSession();
		session.persist(user);
	}

	@Transactional
	public void deleteUser(User user) throws HibernateException{
		Session session = sessionFactory.getCurrentSession();
		session.delete(user);
	}

	@Transactional
	public void updateUser(User user) throws HibernateException {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
	}
	
	@Transactional
	public void displaySimilarUsers(User user) throws HibernateException{
		Session session = null;
		try{
		  session = sessionFactory.getCurrentSession();
		  FullTextSession fullTextSession = org.hibernate.search.Search.getFullTextSession(session);  
		  Transaction tx = fullTextSession.beginTransaction();  
		  QueryBuilder qb = fullTextSession.getSearchFactory().buildQueryBuilder().forEntity( User.class ).get();  
		  org.apache.lucene.search.Query query = qb.keyword().onFields("username").matching("jas").createQuery();  
		  org.hibernate.Query hibQuery = fullTextSession.createFullTextQuery(query, User.class); 
		  List<User> result = hibQuery.list();  
		  Iterator<User> it = result.iterator();  
		  while (it.hasNext()) {  
		   User user1 = (User) it.next();  
		   System.out.println(user1);  
		  }  
		  tx.commit();  		    
		 }  
		 catch (Exception e) {  		 
		 }finally{  
		  session.close();  
		  }  
		   
	}
}
