package com.elka.shop.service;

import com.elka.shop.services.inter.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;


@ContextConfiguration(locations = "classpath*:spring/test-service-context.xml")
public class AbstractSpringContextServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    protected ConsumerService consumerService;
}
