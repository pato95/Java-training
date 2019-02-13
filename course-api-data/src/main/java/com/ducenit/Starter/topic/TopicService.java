package com.ducenit.Starter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository; 
	
	List<Topic> availableTopics= new ArrayList<Topic>(Arrays.asList(
			new Topic("1","Java","This is JAVA SE Course"),
			new Topic("2","Spring","This is a popular JAVA Enterprise Framework"),
			new Topic("3","Javascript","Now controls entire web")
			));
	
	
	public List<Topic> getAllTopics()
	{
		List<Topic> allTopics=new ArrayList<Topic>();
		topicRepository.findAll().forEach(allTopics::add);
		return allTopics;		
	}
	
	public Topic getTopic(String id)
	{
		return topicRepository.findOne(id);
	}
	
	public void addTopic(Topic topic)
	{
	   topicRepository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
	      	
		topicRepository.save(topic);
	 }

	public void removeTopic(String id) {
		
		topicRepository.delete(id);
	}
}
