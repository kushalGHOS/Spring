package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Feedback;
import com.example.service.FeedbackService;

@RestController
@RequestMapping("/feed")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;

	@PostMapping
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		return feedbackService.addFeedback(feedback);
	}

	@GetMapping
	public List<Feedback> getAllFeedbacks() {
		return feedbackService.getAllFeedback();
	}

	@GetMapping("/{id}")
	public Feedback getFeedbackById(@PathVariable int id) {
		return feedbackService.getFeedbackById(id);
	}

	@PutMapping("/{id}")
	public Feedback updateFeedback(@PathVariable int id, @RequestBody Feedback feedback) {
		return feedbackService.updateFeedback(id, feedback);
	}

	@DeleteMapping("/{id}")
	public boolean deleteFeedback(@PathVariable int id) {
		return feedbackService.deleteFeedback(id);
	}

	@GetMapping("/byEmail")
	public List<Feedback> getFeedbacksByEmail(@RequestParam String email) {
		return feedbackService.getFeedbacksByEmail(email);
	}

	@GetMapping("/byNature")
	public List<Feedback> getFeedbacksByNature(@RequestParam boolean nature) {
		return feedbackService.getFeedbacksByNature(nature);
	}

}
