package com.javastudio.tutorial.form;

import org.hibernate.validator.constraints.NotBlank;

public class LoginForm {
    
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    private String clientId;
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
