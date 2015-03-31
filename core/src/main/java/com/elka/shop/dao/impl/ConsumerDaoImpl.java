package com.elka.shop.dao.impl;

import com.elka.shop.dao.inter.ConsumerDao;
import com.elka.shop.domain.Consumer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConsumerDaoImpl implements ConsumerDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void create(Consumer entity) {
        currentSession().save(entity);
    }

    @Override
    public Consumer read(long id) {
        return null;
    }

    @Override
    public List readAll() {
        return null;
    }
}
