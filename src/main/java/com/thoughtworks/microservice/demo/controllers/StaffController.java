package com.thoughtworks.microservice.demo.controllers;

import com.thoughtworks.microservice.demo.models.Staff;
import com.thoughtworks.microservice.demo.repos.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StaffController {
    @Autowired
    private StaffRepository staffRepository;

    @RequestMapping(value="/staff", method = RequestMethod.GET)
    public Iterable<Staff> fetchAll() {
        return staffRepository.findAll();
    }
}
