package com.elka.shop.services.impl;

import com.elka.shop.dao.inter.ConsumerDao;
import com.elka.shop.domain.Consumer;
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
    public boolean checkConsumer(String login, String password) {
        return false;
    }
}
