package com.techworld.springdemo.dao;

import java.util.List;

import com.techworld.springdemo.entity.Feedback;

public interface FeedbackDAO {
	public List<Feedback> getFeedback();

	public void saveFeedback(Feedback theFeedback);
}
