package com.elka.shop.dao;

import com.elka.shop.dao.inter.ConsumerDao;
import com.elka.shop.dao.inter.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(locations = "classpath*:spring/test-context.xml")
public abstract class AbstractSpringContextDaoTest extends AbstractTestNGSpringContextTests {
    @Autowired
    protected ConsumerDao consumerDao;
}
