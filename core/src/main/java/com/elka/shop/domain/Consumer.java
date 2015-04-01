package com.elka.shop.domain;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "consumer")
@Table(appliesTo = "consumer")
public class Consumer implements EntityClass, Serializable {

    @Id
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Consumer() {
    }

    public Consumer(String login, String password, String firstName, String lastName, String patronymic) {
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.login = login;
    }
}
