package com.job_seeker.dto;

public class LogInDTO {
    private String email;
    private String password;

    public LogInDTO() {
    }

    public LogInDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
