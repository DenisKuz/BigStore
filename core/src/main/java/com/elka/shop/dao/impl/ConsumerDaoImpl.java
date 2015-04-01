package com.elka.shop.dao.impl;

import com.elka.shop.dao.inter.ConsumerDao;
import com.elka.shop.domain.Consumer;
import com.elka.shop.domain.EntityClass;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConsumerDaoImpl extends AbstractHibernateTransaction implements ConsumerDao {

    @Override
    public void create(EntityClass entity) {
        currentSession().save(entity);
    }

    @Override
    public Consumer read(Object id) {
        return null;
    }

    @Override
    public void delete(EntityClass entity) {

    }

    @Override
    public List<Consumer> read(List<String> id) {
        return null;
    }
}
