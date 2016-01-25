package edu.asu.diging.tutorial.spring.service;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;

public interface IService {
	public Mood getCurrentMood();
}
