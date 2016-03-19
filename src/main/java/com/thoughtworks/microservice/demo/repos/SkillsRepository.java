package com.thoughtworks.microservice.demo.repos;

import com.thoughtworks.microservice.demo.models.StaffSkill;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SkillsRepository extends
        MongoRepository<StaffSkill, String>,
        PagingAndSortingRepository<StaffSkill, String> {
    StaffSkill findByEmployeeId(String employeeId);
}
