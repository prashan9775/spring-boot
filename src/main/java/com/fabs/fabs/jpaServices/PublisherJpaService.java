package com.fabs.fabs.jpaServices;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.fabs.fabs.model.Publisher;
import com.fabs.fabs.repositories.PublisherRepository;


@Service
public class PublisherJpaService implements PublisherService {

	private PublisherRepository publisherRepository;
		
	public PublisherJpaService(PublisherRepository publisherRepository) {
	        this.publisherRepository = publisherRepository;
	}

	@Override
	public Set<Publisher> getAllPublishers() {
		 Set<Publisher> publishers = new HashSet<>();
		 publisherRepository.findAll().forEach(publishers::add);
	     return publishers.stream().collect(Collectors.toSet());
	}

	@Override
	public Publisher getPublisherDetails(Long id) {
		// TODO Auto-generated method stub
		return publisherRepository.findById(id).orElse(null);
	}  
}

