package com.elka.shop.dao;

import com.elka.shop.dao.inter.ConsumerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations = "classpath*:spring/test-core-context.xml")
public abstract class AbstractSpringContextDaoTest extends AbstractTestNGSpringContextTests {
    @Autowired
    protected ConsumerDao consumerDao;
}
