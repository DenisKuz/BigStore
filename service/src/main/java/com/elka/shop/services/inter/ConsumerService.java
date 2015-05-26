package com.elka.shop.services.inter;

import com.elka.shop.domain.Consumer;
import com.elka.shop.utils.techmessage.TechnicalMessageObject;

public interface ConsumerService {

    Consumer getConsumerByLogin(String login);

    TechnicalMessageObject checkSecurityConsumerData(String login, String password);

    TechnicalMessageObject checkLogin(String login);

    void save(Consumer consumer);

}
