package com.example.hiringmeaaratech.Models;

public class ModelExperience {

    String company;
    String start_date,end_date;

    public ModelExperience(String company, String start_date) {
        this.company = company;
        this.start_date = start_date;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}