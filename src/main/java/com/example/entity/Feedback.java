package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Feedback {
	private int id;
	private String feedbackProductName;
	private String feedbackContents;
	private boolean feedbackNature;
	private String feedbackEmail;

}
