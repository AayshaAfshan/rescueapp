package com.rescueapp.core;

import java.util.Date;

public class Report {
    private String reportId;
    private StrayAnimal animal;
    private User reporter;
    private Date date;
    private String description;

    public Report() { }

    public Report(String reportId, StrayAnimal animal, User reporter, Date date, String description) {
        this.reportId = reportId;
        this.animal = animal;
        this.reporter = reporter;
        this.date = date;
        this.description = description;
    }

    public String getReportId() { return reportId; }
    public void setReportId(String reportId) { this.reportId = reportId; }

    public StrayAnimal getAnimal() { return animal; }
    public void setAnimal(StrayAnimal animal) { this.animal = animal; }

    public User getReporter() { return reporter; }
    public void setReporter(User reporter) { this.reporter = reporter; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
