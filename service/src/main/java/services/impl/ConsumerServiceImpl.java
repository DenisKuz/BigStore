package services.impl;

import com.elka.shop.domain.Consumer;
import services.inter.ConsumerService;

public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public Consumer getConsumerByLogin(String login) {
        return null;
    }

    @Override
    public boolean checkConsumer(String login, String password) {
        return false;
    }
}
