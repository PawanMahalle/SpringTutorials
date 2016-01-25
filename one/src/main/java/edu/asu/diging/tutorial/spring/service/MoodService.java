package edu.asu.diging.tutorial.spring.service;
 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service
public class MoodService implements IService{
 
	Random random;
	List<Mood> moods;
	Map<String, String> moodExplanationMap;
	
	@PostConstruct
    public void init(){
    	
    	random = new Random();
    	
    	moods = new ArrayList<Mood>();
    	moods.add(new Mood("Happy"));
    	moods.add(new Mood("Sad"));
    	moods.add(new Mood("Excited"));
    	
    	moodExplanationMap = new HashMap<String, String>();
    	moodExplanationMap.put("Happy", "I caught BIG mouse today!");
    	moodExplanationMap.put("Sad", "No food to eat! Hungry already :(");
    	moodExplanationMap.put("Excited", "I see BIG mouse busy eating cheese! I can easily catch it!");
    }
	
    public Mood getCurrentMood() {
        return moods.get(random.nextInt(moods.size()));
    }
    
	public String getCurrentMoodExplanation(String mood) {
		return moodExplanationMap.get(mood);
	}

}