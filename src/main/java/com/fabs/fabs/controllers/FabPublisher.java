package com.fabs.fabs.controllers;


import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fabs.fabs.jpaServices.AuthorService;
import com.fabs.fabs.jpaServices.PublisherService;
import com.fabs.fabs.model.Author;
import com.fabs.fabs.model.Publisher;

/**
 * Created by jt on 5/25/17.
 */
@RestController
public class FabPublisher {
    public static final String BASE_URL = "/api/v1/authors";
    private final PublisherService publisherService;

    @Autowired
    public FabPublisher(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @RequestMapping({"/publisher", ""})
    @ResponseStatus(HttpStatus.OK)
    public Set<Publisher> showAllPublishers(){
    	 return publisherService.getAllPublishers();
    }
    
    @RequestMapping("/publisher/{publisherId}")
    public Publisher showPublisher(@PathVariable Long publisherId) {
        return publisherService.getPublisherDetails(publisherId);
    }
}
