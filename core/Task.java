package com.rescueapp.core;

import java.util.Date;

public class Task {
    private String taskId;
    private String description;
    private String status; // "Open","InProgress","Done"
    private Date date;
    private User assignee; // Volunteer or NGO (both extend User)

    public Task() { }

    public Task(String taskId, String description, String status, Date date, User assignee) {
        this.taskId = taskId;
        this.description = description;
        this.status = status;
        this.date = date;
        this.assignee = assignee;
    }

    public String getTaskId() { return taskId; }
    public void setTaskId(String taskId) { this.taskId = taskId; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public User getAssignee() { return assignee; }
    public void setAssignee(User assignee) { this.assignee = assignee; }
}
