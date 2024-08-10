package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.entity.Feedback;
import com.example.repository.FeedbackRepository;

@Service
public class FeedbackService implements FeedbackRepository {
	List<Feedback> fe = new ArrayList<>();

	@Override
	public Feedback addFeedback(Feedback f) {
		fe.add(f);
		return f;
	}

	@Override
	public List<Feedback> getAllFeedback() {
		return fe;
	}

	@Override
	public Feedback getFeedbackById(int id) {

		return fe.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	}

	@Override
	public Feedback updateFeedback(int id, Feedback f) {
		for (Feedback fi : fe) {
			if (fi.getId() == id) {
				fi.setFeedbackProductName(f.getFeedbackProductName());
				fi.setFeedbackContents(f.getFeedbackContents());
				fi.setFeedbackEmail(f.getFeedbackEmail());
				fi.setFeedbackNature(f.isFeedbackNature());
				return fi;
			}

		}
		return null;
	}

	@Override
	public boolean deleteFeedback(int id) {
		return fe.removeIf(x -> x.getId() == id);

	}

	@Override
	public List<Feedback> getFeedbacksByEmail(String email) {

		return fe.stream().filter(x -> x.getFeedbackEmail().equals(email)).collect(Collectors.toList());
	}

	@Override
	public List<Feedback> getFeedbacksByNature(boolean nature) {

		return fe.stream().filter(x -> x.isFeedbackNature() == nature).collect(Collectors.toList());
	}

}
