package com.example.lab1studenskiklub.model;

public class event {
    private int id;
    private String name;
    private String description;
    private String date;
    private String location;
    public event(int id, String name, String description, String date, String location) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.date = date;
        this.location = location;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getDate() {
        return date;
    }
    public String getLocation() {
        return location;
    }
}

