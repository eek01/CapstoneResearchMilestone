package com.example.capstoneresearch_todo.Model;

public class ToDoModel {
    private String task;
    private int id, status;

    //Getters
    public String getTask() {
        return task;
    }

    public int getId() {
        return id;
    }

    public int getStatus() {
        return status;
    }

    //Setters
    public void setTask(String task) {
        this.task = task;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
