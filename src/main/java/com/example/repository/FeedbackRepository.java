package com.example.repository;

import java.util.List;

import com.example.entity.Feedback;

public interface FeedbackRepository {
	Feedback addFeedback(Feedback f);

	List<Feedback> getAllFeedback();

	Feedback getFeedbackById(int id);

	Feedback updateFeedback(int id, Feedback f);

	boolean deleteFeedback(int id);

	List<Feedback> getFeedbacksByEmail(String email);

	List<Feedback> getFeedbacksByNature(boolean nature);

}
