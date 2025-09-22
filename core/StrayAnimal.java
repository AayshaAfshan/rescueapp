package com.rescueapp.core;

public class StrayAnimal {
    private String animalId;
    private String specifications;
    private String photoUrl;
    private String medReport;
    private String status;

    public StrayAnimal() {
    }

    public StrayAnimal(String animalId, String specifications, String photoUrl, String medReport, String status) {
        this.animalId = animalId;
        this.specifications = specifications;
        this.photoUrl = photoUrl;
        this.medReport = medReport;
        this.status = status;
    }

    public String getAnimalId() {
        return animalId;
    }

    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getMedReport() {
        return medReport;
    }

    public void setMedReport(String medReport) {
        this.medReport = medReport;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // A simple method to return information summary
    public String getInfo() {
        return "Animal ID: " + animalId + "\n" +
               "Specifications: " + specifications + "\n" +
               "Medical Report: " + medReport + "\n" +
               "Current Status: " + status;
    }

    @Override
    public String toString() {
        return "StrayAnimal{" +
                "animalId='" + animalId + '\'' +
                ", specifications='" + specifications + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", medReport='" + medReport + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
