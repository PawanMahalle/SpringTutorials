package edu.asu.diging.tutorial.spring.service;
 
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
 
import edu.asu.diging.tutorial.spring.domain.Mood;
 
@Service
public class MoodService implements IService{
 
	/*
	 * Random object to generate random number for mood selection
	 */
	static Random random = new Random();
	
	/*
	 * List of moods tomcat can take.
	 */
	static List<Mood> moods = new ArrayList<Mood>();
	
    public Mood getCurrentMood() {
        return moods.get(random.nextInt(moods.size()));
    }
    
    @PostConstruct
    public void init(){
    	moods.add(new Mood("Happy"));
    	moods.add(new Mood("Euphoric"));
    	moods.add(new Mood("Melancholic"));
    }
}