package com.elka.shop.services.inter;

import com.elka.shop.domain.Consumer;

public interface ConsumerService {

    Consumer getConsumerByLogin(String login);

    String checkConsumer(String login, String password);

}
