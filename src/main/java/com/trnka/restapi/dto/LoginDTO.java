package com.trnka.restapi.dto;

public class LoginDTO {
    private String authCode;

    public LoginDTO() {
        super();
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(final String authCode) {
        this.authCode = authCode;
    }
}
