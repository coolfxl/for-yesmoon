package com.yesmoon.pojo;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String cameraList;

    private Integer role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getCameraList() {
        return cameraList;
    }

    public void setCameraList(String cameraList) {
        this.cameraList = cameraList == null ? null : cameraList.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}