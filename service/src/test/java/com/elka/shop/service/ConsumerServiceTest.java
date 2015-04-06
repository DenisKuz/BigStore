package com.elka.shop.service;

import com.elka.shop.domain.Consumer;
import org.testng.annotations.Test;

public class ConsumerServiceTest extends AbstractSpringContextServiceTest {

    @Test
    public void testGetConsumerByLogin() {
       Consumer consumer = consumerService.getConsumerByLogin("ivan");
    }
}
