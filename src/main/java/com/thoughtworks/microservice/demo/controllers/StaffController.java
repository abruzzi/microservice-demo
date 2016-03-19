package com.thoughtworks.microservice.demo.controllers;

import com.thoughtworks.microservice.demo.models.Staff;
import com.thoughtworks.microservice.demo.repos.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staffs")
public class StaffController {
    @Autowired
    private StaffRepository staffRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List fetchAll(@RequestParam(value = "page", defaultValue = "0", required = false) int page,
                         @RequestParam(value = "count", defaultValue = "10", required = false) int count,
                         @RequestParam(value = "order", defaultValue = "ASC", required = false) Sort.Direction direction,
                         @RequestParam(value = "sort", defaultValue = "loginName", required = false) String loginName) {

        Page result = staffRepository.findAll(new PageRequest(page, count, new Sort(direction, loginName)));
        return result.getContent();
    }

    @RequestMapping(value="/{loginName}", method = RequestMethod.GET)
    public Staff find(@PathVariable String loginName) {
        return staffRepository.findByLoginName(loginName);
    }
}
