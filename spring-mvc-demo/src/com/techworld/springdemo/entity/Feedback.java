package com.techworld.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "feedback")
public class Feedback {
	
	public Feedback() {
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feedback_id")
	private int feedBackId;
	@Column(name = "feedback_name")
	private String feedBackName;
	@Column(name = "feedback_email")
	private String feedBackEmail;
	@Column(name = "feedback_narrative")
	private String feedBackNarrative;
	@Column(name = "teaching_type_code")
	private String teachingTypeCode;
	@Column(name = "feedback_rating")
	private String feedBackRating;
	public int getFeedBackId() {
		return feedBackId;
	}
	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
	}
	public String getFeedBackName() {
		return feedBackName;
	}
	public void setFeedBackName(String feedBackName) {
		this.feedBackName = feedBackName;
	}
	public String getFeedBackEmail() {
		return feedBackEmail;
	}
	public void setFeedBackEmail(String feedBackEmail) {
		this.feedBackEmail = feedBackEmail;
	}
	public String getFeedBackNarrative() {
		return feedBackNarrative;
	}
	public void setFeedBackNarrative(String feedBackNarrative) {
		this.feedBackNarrative = feedBackNarrative;
	}
	public String getTeachingTypeCode() {
		return teachingTypeCode;
	}
	public void setTeachingTypeCode(String teachingTypeCode) {
		this.teachingTypeCode = teachingTypeCode;
	}
	public String getFeedBackRating() {
		return feedBackRating;
	}
	public void setFeedBackRating(String feedBackRating) {
		this.feedBackRating = feedBackRating;
	}
	public Feedback(int feedBackId, String feedBackName, String feedBackEmail, String feedBackNarrative,
			String teachingTypeCode, String feedBackRating) {
		super();
		this.feedBackId = feedBackId;
		this.feedBackName = feedBackName;
		this.feedBackEmail = feedBackEmail;
		this.feedBackNarrative = feedBackNarrative;
		this.teachingTypeCode = teachingTypeCode;
		this.feedBackRating = feedBackRating;
	}
	@Override
	public String toString() {
		return "Feedback [feedBackId=" + feedBackId + ", feedBackName=" + feedBackName + ", feedBackEmail="
				+ feedBackEmail + ", feedBackNarrative=" + feedBackNarrative + ", teachingTypeCode=" + teachingTypeCode
				+ ", feedBackRating=" + feedBackRating + "]";
	}
	
}
