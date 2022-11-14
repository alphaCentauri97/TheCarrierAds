package com.example.hiringmeaaratech.Models;

public class ModelTypesOfJob {

    String jobName, post_date, start_date, last_date, description;

    public ModelTypesOfJob(String jobName, String post_date, String start_date, String last_date, String description) {
        this.jobName = jobName;
        this.post_date = post_date;
        this.start_date = start_date;
        this.last_date = last_date;
        this.description = description;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getPost_date() {
        return post_date;
    }

    public void setPost_date(String post_date) {
        this.post_date = post_date;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getLast_date() {
        return last_date;
    }

    public void setLast_date(String last_date) {
        this.last_date = last_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}