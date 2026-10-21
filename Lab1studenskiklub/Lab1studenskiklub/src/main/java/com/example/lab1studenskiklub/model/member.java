package com.example.lab1studenskiklub.model;

public class member {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String studyProgram;
    private int eventId;
    public member(int id, String firstname, String lastname, String email, String studyProgram, int eventId) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.studyProgram = studyProgram;
        this.eventId = eventId;
    }
   public int getId(){
        return id;
   }
   public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public String getStudyProgram() {
        return studyProgram;
    }
    public int getEventId() {
        return eventId;
    }
}
