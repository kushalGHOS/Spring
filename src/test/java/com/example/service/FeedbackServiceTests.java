package com.example.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.entity.Feedback;

public class FeedbackServiceTests {
	@Test
	void testGetFeedback() {
		FeedbackService feedbackService = new FeedbackService();
		Feedback feedback = new Feedback(1, "Product1", "Great product", true, "user@example.com");

		feedbackService.addFeedback(feedback);
		assertEquals(1, feedbackService.getAllFeedback().size());
	}

	@Test
	void testUpdateFeedback() {
		FeedbackService feedbackService = new FeedbackService();
		Feedback feedback = new Feedback(1, "Product1", "Great product", true, "k@example.com");

		feedbackService.addFeedback(feedback);
		feedback.setFeedbackContents("Updated content");
		Feedback updatedFeedback = feedbackService.updateFeedback(1, feedback);

		assertEquals("Updated content", updatedFeedback.getFeedbackContents());
	}

	@Test
	void testDeleteFeedback() {
		FeedbackService feedbackService = new FeedbackService();
		Feedback feedback = new Feedback(1, "Product1", "Great product", true, "k@example.com");

		feedbackService.addFeedback(feedback);
		boolean isDeleted = feedbackService.deleteFeedback(1);

		assertTrue(isDeleted);
		assertEquals(0, feedbackService.getAllFeedback().size());
	}

}
