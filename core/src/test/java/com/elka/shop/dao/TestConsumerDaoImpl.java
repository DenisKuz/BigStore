package com.elka.shop.dao;

import com.elka.shop.domain.Consumer;
import org.testng.annotations.Test;

public class TestConsumerDaoImpl extends AbstractSpringContextDaoTest {

    @Test
    public void testSave() {
        Consumer consumer = new Consumer("54","mark","Boss","Mark","Jon");
         consumerDaoImpl.create(consumer);
      //  Assert.assertEquals(string, "123");
    }
}
