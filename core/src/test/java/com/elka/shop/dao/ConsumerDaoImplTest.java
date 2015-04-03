package com.elka.shop.dao;

import com.elka.shop.domain.Consumer;
import org.testng.annotations.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class ConsumerDaoImplTest extends AbstractSpringContextDaoTest {

    Consumer consumer = new Consumer("ee", "mark", "Boss", "Mark", "Jon");

    @Test(priority = -1)
    public void testSave() {
        consumerDao.create(consumer);
    }

    @Test
    public void testDelete() {
        consumerDao.delete(consumer);
    }

    @Test
    public void testReadOnId() {
        Consumer consumer1 = consumerDao.read("57");
    }

    @Test
    public void testReadList() {
        List<Consumer> consumerList = consumerDao.readList(asList("57", "5700"));
    }
}
