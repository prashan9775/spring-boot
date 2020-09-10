package com.fabs.fabs.jpaServices;

import java.util.ArrayList;
import java.util.Set;

import com.fabs.fabs.model.Author;

public interface AuthorService {

    Set<Author> getAllAuthors();
    Author getAuthorDetails(Long id);
}
