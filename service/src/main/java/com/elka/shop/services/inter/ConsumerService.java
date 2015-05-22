package com.elka.shop.services.inter;

import com.elka.shop.domain.Consumer;

public interface ConsumerService {

    Consumer getConsumerByLogin(String login);

    String checkSecurityConsumerData(String login, String password);

    String checkLogin(String login);

    void save(Consumer consumer);

}
