package com.example.demo.entity;

public class Student {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{"+
                "id="+ id +
                ", name='"+ name + '\'' +
                '}';
    }
}
