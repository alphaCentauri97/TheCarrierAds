package com.example.hiringmeaaratech.JobEmployer;

public class ModelPostJobs {

    int imgCompany;
    String technology,location,jobType,experience;

    public ModelPostJobs(int imgCompany, String technology, String location, String jobType, String experience) {
        this.imgCompany = imgCompany;
        this.technology = technology;
        this.location = location;
        this.jobType = jobType;
        this.experience = experience;
    }

    public int getImgCompany() {
        return imgCompany;
    }

    public void setImgCompany(int imgCompany) {
        this.imgCompany = imgCompany;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
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
