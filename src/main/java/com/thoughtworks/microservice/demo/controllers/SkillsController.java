package com.thoughtworks.microservice.demo.controllers;

import com.thoughtworks.microservice.demo.models.Skill;
import com.thoughtworks.microservice.demo.models.StaffSkill;
import com.thoughtworks.microservice.demo.repos.SkillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/skills")
public class SkillsController {
    @Autowired
    private SkillsRepository skillsRepository;

    @RequestMapping(value = "/{employeeId}", method = RequestMethod.GET)
    public List<Skill> skillsOf(@PathVariable String employeeId) {
        StaffSkill staffSkill = skillsRepository.findByEmployeeId(employeeId);
        return staffSkill.getSkills();
    }
}
