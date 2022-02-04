package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TopicsService;

import com.example.model.Topic;

@RestController

public class TopicsController {
	
	@Autowired
	private  TopicsService topicservice;
	
	
	@RequestMapping("/topics")
    public List<Topic> all_topics(){
		return topicservice.getAllTopicList();
	}
	
	/*
	 * @RequestMapping("/topics/{id}") public Topic geTopic(@PathVariable("id")
	 * String id){ return topicservice.getTopic(id); }
	 * 
	 * @RequestMapping(method = RequestMethod.POST,value = "/topics") public void
	 * addTopics(@RequestBody Topic topic){ topicservice.addTopic(topic); }
	 */
	
}
