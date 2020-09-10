package com.fabs.fabs.jpaServices;


import java.util.Set;
import com.fabs.fabs.model.Publisher;

public interface PublisherService {

    Set<Publisher> getAllPublishers();
    Publisher getPublisherDetails(Long id);
}
