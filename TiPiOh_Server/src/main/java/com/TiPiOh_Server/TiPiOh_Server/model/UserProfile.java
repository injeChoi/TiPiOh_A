package com.TiPiOh_Server.TiPiOh_Server.model;

public class UserProfile {
    private String id;
    private String name;
    private String phone;
    private String email;

    public String getId() { return id; }
    public String getName() { return name; }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}