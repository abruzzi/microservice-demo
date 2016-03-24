package com.thoughtworks.microservice.demo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="staff")
public class Staff {
    @Id
    private String id;

    private TravelPreferences travelPreferences;
    private SimpleEntity department;
    private SimpleEntity grade;
    private SimpleEntity role;

    private Picture picture;

    private String projectPreferences;
    private String longTermGoal;

    private SimpleEntity homeOffice;
    private SimpleEntity workingOffice;

    private String gender;
    private String preferredName;
    private String loginName;
    private String employeeId;
    private String hireDate;
    private Double totalExperience;
    private Double twExperience;
    private boolean assignable;

    public StaffSkill getStaffSkills() {
        return staffSkills;
    }

    public void setStaffSkills(StaffSkill staffSkills) {
        this.staffSkills = staffSkills;
    }

    @DBRef
    private StaffSkill staffSkills;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TravelPreferences getTravelPreferences() {
        return travelPreferences;
    }

    public void setTravelPreferences(TravelPreferences travelPreferences) {
        this.travelPreferences = travelPreferences;
    }

    public SimpleEntity getDepartment() {
        return department;
    }

    public void setDepartment(SimpleEntity department) {
        this.department = department;
    }

    public SimpleEntity getGrade() {
        return grade;
    }

    public void setGrade(SimpleEntity grade) {
        this.grade = grade;
    }

    public SimpleEntity getRole() {
        return role;
    }

    public void setRole(SimpleEntity role) {
        this.role = role;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    public String getProjectPreferences() {
        return projectPreferences;
    }

    public void setProjectPreferences(String projectPreferences) {
        this.projectPreferences = projectPreferences;
    }

    public String getLongTermGoal() {
        return longTermGoal;
    }

    public void setLongTermGoal(String longTermGoal) {
        this.longTermGoal = longTermGoal;
    }

    public SimpleEntity getHomeOffice() {
        return homeOffice;
    }

    public void setHomeOffice(SimpleEntity homeOffice) {
        this.homeOffice = homeOffice;
    }

    public SimpleEntity getWorkingOffice() {
        return workingOffice;
    }

    public void setWorkingOffice(SimpleEntity workingOffice) {
        this.workingOffice = workingOffice;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPreferredName() {
        return preferredName;
    }

    public void setPreferredName(String preferredName) {
        this.preferredName = preferredName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Double getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(Double totalExperience) {
        this.totalExperience = totalExperience;
    }

    public Double getTwExperience() {
        return twExperience;
    }

    public void setTwExperience(Double twExperience) {
        this.twExperience = twExperience;
    }

    public boolean isAssignable() {
        return assignable;
    }

    public void setAssignable(boolean assignable) {
        this.assignable = assignable;
    }
}
