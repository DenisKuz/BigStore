package com.elka.shop.utils.techmessage;

public class TechnicalMessageObject {

    private int messageCode;
    private String messageText;

    public TechnicalMessageObject(int messageCode, String messageText) {
        this.messageCode = messageCode;
        this.messageText = messageText;
    }
//get methods must be otherwise MappingJackson2HttpMessageConverter will not work!
    public int getMessageCode() {
        return messageCode;
    }

    public String getMessageText() {
        return messageText;
    }
}
