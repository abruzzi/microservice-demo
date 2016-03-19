package com.thoughtworks.microservice.demo.repos;

import com.thoughtworks.microservice.demo.models.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdStaffRepository extends PagingAndSortingRepository<Staff, String>, MongoRepository<Staff, String> {

}
