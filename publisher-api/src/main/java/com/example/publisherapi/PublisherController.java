package com.example.publisherapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublisherController {

	@Autowired
	PublisherComponent publisherComponent;
	
	@Autowired
	PublisherRepository publishRepository;
	
	@GetMapping("/init")
	public int init() {
		
		publisherComponent.downloadPublisherInfo();
		
		return 1;
	}
	
	@GetMapping("/publisher")
	public List<Publisher> getPublisherList() {
		return publishRepository.findAll();
	}
	
	@GetMapping("/publisher/{id}")
	public Publisher getPublisherById(@PathVariable("id") int id) {
		return publishRepository.findById(id).orElse(new Publisher());
	}
	
}
