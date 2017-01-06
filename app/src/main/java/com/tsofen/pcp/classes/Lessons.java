package com.tsofen.pcp.classes;

/**
 * Created by Pcp on 06/01/2017.
 */

public class Lessons {
    private String lecturer, subject , date;

    public Lessons() {
    }

    public Lessons(String lecturer, String subject) {
        this.lecturer = lecturer;
        this.subject = subject;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String name) {
        this.lecturer = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    }


