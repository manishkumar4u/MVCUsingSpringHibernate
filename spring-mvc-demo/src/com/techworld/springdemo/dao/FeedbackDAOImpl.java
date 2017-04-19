package com.techworld.springdemo.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techworld.springdemo.entity.Feedback;

@Repository
public class FeedbackDAOImpl implements FeedbackDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	public List<Feedback> getFeedback() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Feedback> theQuery = currentSession.createQuery(" from Feedback ", Feedback.class);
		List<Feedback> feedback = theQuery.getResultList();
		return feedback;
	}
	@Override
	@Transactional
	public void saveFeedback(Feedback theFeedback) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theFeedback);
	}

}
