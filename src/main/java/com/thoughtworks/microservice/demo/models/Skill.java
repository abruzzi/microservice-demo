package com.thoughtworks.microservice.demo.models;

public class Skill {
    private String name;
    private Integer rating;
    private SimpleEntity group;

    public Skill() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public SimpleEntity getGroup() {
        return group;
    }

    public void setGroup(SimpleEntity group) {
        this.group = group;
    }
}
