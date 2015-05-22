package com.elka.shop.services.impl;

import com.elka.shop.dao.inter.ConsumerDao;
import com.elka.shop.domain.Consumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.elka.shop.services.inter.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    private final static String NO_USER = "user does not exist! Please register";
    private final static String WRONG_PASSWORD = "password is not right!";
    private final static String GOOD_IDENTIFICATION = "hello";

    private final static String EXISTING_LOGIN = "this login already exist!";
    private final static String GOOD_REGISTRATION = "You are registered";

    @Autowired
    private ConsumerDao consumerDao;

    @Override
    public Consumer getConsumerByLogin(String login) {
        return consumerDao.read(login);
    }

    @Override
    public String checkSecurityConsumerData(String login, String password) {
        Consumer consumer = consumerDao.read(login);
        if (consumer == null) return NO_USER;
        boolean bool = password.equals(consumer.getPassword());
        if (!bool) return WRONG_PASSWORD;
        return GOOD_IDENTIFICATION;
    }

    @Override
    public String checkLogin(String login) {
        Consumer consumer = consumerDao.read(login);
        if (consumer != null) return EXISTING_LOGIN;
        return GOOD_REGISTRATION;
    }

    @Override
    public void save(Consumer consumer) {
        consumerDao.create(consumer);
    }
}
