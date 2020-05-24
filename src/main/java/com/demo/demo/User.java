package com.demo.demo;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("User")

public class User {
    int id;
    String name;
    String degistaion;

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", degistaion='" + degistaion + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDegistaion() {
        return degistaion;
    }

    public void setDegistaion(String degistaion) {
        this.degistaion = degistaion;
    }

    public User(int id, String name, String degistaion) {
        this.id = id;
        this.name = name;
        this.degistaion = degistaion;
    }
}
