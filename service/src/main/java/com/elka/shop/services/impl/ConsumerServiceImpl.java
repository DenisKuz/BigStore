package com.elka.shop.services.impl;

import com.elka.shop.dao.inter.ConsumerDao;
import com.elka.shop.domain.Consumer;

import static com.elka.shop.utils.techmessage.TechnicalMessage.*;

import com.elka.shop.utils.techmessage.TechnicalMessageObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.elka.shop.services.inter.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Autowired
    private ConsumerDao consumerDao;

    @Override
    public Consumer getConsumerByLogin(String login) {
        return consumerDao.read(login);
    }

    @Override
    public TechnicalMessageObject checkSecurityConsumerData(String login, String password) {
        Consumer consumer = consumerDao.read(login);
        if (consumer == null) return new TechnicalMessageObject(1, NO_USER.getMessage());
        boolean bool = password.equals(consumer.getPassword());
        if (!bool) return new TechnicalMessageObject(1, WRONG_PASSWORD.getMessage());
        return new TechnicalMessageObject(0, GOOD_IDENTIFICATION.getMessage());
    }

    @Override
    public TechnicalMessageObject checkLogin(String login) {
        Consumer consumer = consumerDao.read(login);
        if (consumer != null) return new TechnicalMessageObject(1, EXISTING_LOGIN.getMessage());
        return new TechnicalMessageObject(0, GOOD_REGISTRATION.getMessage());
    }

    @Override
    public void save(Consumer consumer) {
        consumerDao.create(consumer);
    }
}
