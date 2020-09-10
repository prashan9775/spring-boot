package com.fabs.fabs.jpaServices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.fabs.fabs.model.Author;
import com.fabs.fabs.repositories.AuthorRepository;


/**
 * Created by jt on 8/5/18.
 */
@Service
public class AuthorJpaService implements AuthorService {

	private AuthorRepository authorRepository;
		
	public AuthorJpaService(AuthorRepository authorRepository) {
	        this.authorRepository = authorRepository;
	}

	@Override
	public Set<Author> getAllAuthors() {
		// TODO Auto-generated method stub
		    Set<Author> authors = new HashSet<>();
	        authorRepository.findAll().forEach(authors::add);
	        return authors.stream().collect(Collectors.toSet());
	}

	@Override
	public Author getAuthorDetails(Long id) {
		// TODO Auto-generated method stub
		 return authorRepository.findById(id).orElse(null);
	}  
}

