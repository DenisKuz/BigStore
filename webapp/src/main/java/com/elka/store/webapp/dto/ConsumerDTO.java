package com.elka.store.webapp.dto;

import java.io.Serializable;
// is not used
public class ConsumerDTO implements Serializable {

    private String login;
    private String password;
    private String firstName;
    private String lastName;

    public ConsumerDTO(String login, String password, String firstName, String lastName) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
