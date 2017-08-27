package com.springboot.bank.springbootexample.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private  List<Topic> topics = Arrays.asList(
			new Topic("1","Hi","SpringBoot"),
			new Topic("2","Hola","Spanish"));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic (String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
}
