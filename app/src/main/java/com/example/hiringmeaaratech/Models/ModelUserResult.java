package com.example.hiringmeaaratech.Models;

public class ModelUserResult {
    int img;
    String company_name, location, jobType, experience;
    String salary;

    public ModelUserResult(int img, String company_name, String location, String jobType, String experience, String salary) {
        this.img = img;
        this.company_name = company_name;
        this.location = location;
        this.jobType = jobType;
        this.experience = experience;
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
