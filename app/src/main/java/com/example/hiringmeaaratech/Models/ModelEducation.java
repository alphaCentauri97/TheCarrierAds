package com.example.hiringmeaaratech.Models;

public class ModelEducation {

    String college,education,year;

    public ModelEducation(String college, String education, String year) {
        this.college = college;
        this.education = education;
        this.year = year;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
