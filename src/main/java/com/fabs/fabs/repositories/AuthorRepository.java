package com.fabs.fabs.repositories;


import org.springframework.data.repository.CrudRepository;

import com.fabs.fabs.model.Author;

/**
 * Created by jt on 5/16/17.
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
	
}
