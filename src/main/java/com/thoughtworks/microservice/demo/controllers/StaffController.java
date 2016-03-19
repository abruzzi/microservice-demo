package com.thoughtworks.microservice.demo.controllers;

import com.thoughtworks.microservice.demo.models.Staff;
import com.thoughtworks.microservice.demo.repos.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class StaffController {
    @Autowired
    private StaffRepository staffRepository;

    @RequestMapping(value="/staffs", method = RequestMethod.GET)
    public Iterable<Staff> fetchAll() {
        return staffRepository.findAll();
    }

    @RequestMapping(value="/staffs/{loginName}", method = RequestMethod.GET)
    public Staff find(@PathVariable String loginName) {
        return staffRepository.findByLoginName(loginName);
    }
}
