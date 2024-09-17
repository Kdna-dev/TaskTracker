package com.kdnadev.TaskTracker.task;

import java.sql.Date;

public class TaskManager {
    private static int idGenerator = 0;

    private int id;
    private String description;
    private String status;
    private Date createdAt;
    private Date updatedAt;

    public TaskManager(int id, String description, String status, Date createdAt, Date updatedAt) {
        idGenerator++;

        this.id = idGenerator;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
