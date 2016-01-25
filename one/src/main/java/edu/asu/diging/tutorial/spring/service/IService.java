package edu.asu.diging.tutorial.spring.service;

import edu.asu.diging.tutorial.spring.domain.Mood;

public interface IService {
	public Mood getCurrentMood();
	public String getCurrentMoodExplanation(String mood);
}
