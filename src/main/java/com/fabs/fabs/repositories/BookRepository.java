package com.fabs.fabs.repositories;

import org.springframework.data.repository.CrudRepository;

import com.fabs.fabs.model.Book;

/**
 * Created by jt on 5/16/17.
 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
