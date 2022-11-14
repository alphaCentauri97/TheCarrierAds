package com.example.hiringmeaaratech.Models;

public class ModelRecommendedJobs {
    int imgCompany;
    String company_name,technology, jobType, description,postedBy,postedDate,skills,location;

    public ModelRecommendedJobs(int imgCompany, String company_name, String technology, String jobType, String description,String location) {
        this.imgCompany = imgCompany;
        this.company_name = company_name;
        this.technology = technology;
        this.jobType = jobType;
        this.description = description;
        this.location = location;
    }

    public int getImgCompany() {
        return imgCompany;
    }

    public void setImgCompany(int imgCompany) {
        this.imgCompany = imgCompany;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostedBy() {
        return postedBy;
    }

    public void setPostedBy(String postedBy) {
        this.postedBy = postedBy;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
