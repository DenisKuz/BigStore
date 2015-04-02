package com.elka.shop.dao.impl;

import com.elka.shop.dao.inter.ConsumerDao;
import com.elka.shop.domain.Consumer;
import com.elka.shop.domain.EntityClass;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ConsumerDaoImpl extends AbstractHibernateTransaction implements ConsumerDao {

    @Override
    public void create(Consumer entity) {
        currentSession().save(entity);
    }


    @Override
    public Consumer read(String id) {
        return (Consumer) currentSession().get(Consumer.class, id);
    }

    @Override
    public void delete(Consumer entity) {
        currentSession().delete(entity);
    }

    @Override
    public List<Consumer> readList(List<String> listId) {
        List<Consumer> consumerList = new ArrayList<>(listId.size());
        for (String id : listId) {
            consumerList.add(read(id));
        }
        return consumerList;
    }
}
