package com.thoughtworks.microservice.demo.repos;

import com.thoughtworks.microservice.demo.models.Staff;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends MongoRepository<Staff, String> {
    Staff findByLoginName(String loginName);
}
