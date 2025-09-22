package com.rescueapp.core;

import java.util.Date;

public class AdoptionRequest {
    private String requestId;
    private StrayAnimal animal;
    private User adopter;
    private Date requestDate;
    private String status; // "Pending","Approved","Rejected"

    public AdoptionRequest() { }

    public AdoptionRequest(String requestId, StrayAnimal animal, User adopter, Date requestDate, String status) {
        this.requestId = requestId;
        this.animal = animal;
        this.adopter = adopter;
        this.requestDate = requestDate;
        this.status = status;
    }

    public String getRequestId() { return requestId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }

    public StrayAnimal getAnimal() { return animal; }
    public void setAnimal(StrayAnimal animal) { this.animal = animal; }

    public User getAdopter() { return adopter; }
    public void setAdopter(User adopter) { this.adopter = adopter; }

    public Date getRequestDate() { return requestDate; }
    public void setRequestDate(Date requestDate) { this.requestDate = requestDate; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
