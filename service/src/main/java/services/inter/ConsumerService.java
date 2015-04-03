package services.inter;

import com.elka.shop.domain.Consumer;

public interface ConsumerService {

    Consumer getConsumerByLogin(String login);

    boolean checkConsumer(String login, String password);
}
