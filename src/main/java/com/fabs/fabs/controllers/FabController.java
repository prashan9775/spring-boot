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
import com.fabs.fabs.model.Author;

/**
 * Created by jt on 5/25/17.
 */
@RestController
public class FabController {
    public static final String BASE_URL = "/api/v1/authors";
    private final AuthorService authorService;

    @Autowired
    public FabController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping({"/", ""})
    @ResponseStatus(HttpStatus.OK)
    public Set<Author> showAllAuthors(){
    	 return authorService.getAllAuthors();
    }
    
    @RequestMapping("/{authorId}")
    public Author showAuthor(@PathVariable Long authorId) {
        return authorService.getAuthorDetails(authorId);
    }
}
