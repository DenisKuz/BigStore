package com.elka.shop.utils.techmessage;

public enum TechnicalMessage {

    NO_USER("user does not exist! Please register"),
    WRONG_PASSWORD("password is not right!"),
    GOOD_IDENTIFICATION("hello"),
    EXISTING_LOGIN("this login already exist!"),
    GOOD_REGISTRATION("You are registered");

    private String message;

    TechnicalMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
