package com.myproject.ecommerce.backend.api.model;

public class LoginResponse {

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    private String jwt;

}
