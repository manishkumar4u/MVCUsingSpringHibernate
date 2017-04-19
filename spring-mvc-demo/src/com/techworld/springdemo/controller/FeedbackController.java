package com.techworld.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techworld.springdemo.dao.FeedbackDAO;
import com.techworld.springdemo.entity.Feedback;

@Controller
public class FeedbackController {
	@Autowired
	private FeedbackDAO feedbackDAO;

	@PostMapping("/showFeedbackAdd")
	public String saveCustomer(@ModelAttribute("feedback") Feedback theFeedback) {
		feedbackDAO.saveFeedback(theFeedback);
		return "add_feedback";
	}

	@RequestMapping("/addFeedback")
	public String Feedback(Model theModel) {
		Feedback theFeedback = new Feedback();
		theModel.addAttribute("feedback", theFeedback);
		return "add_feedback";
	}
}
