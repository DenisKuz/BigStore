package com.elka.shop.dao.impl;

import com.elka.shop.dao.inter.ConsumerDao;
import com.elka.shop.domain.Consumer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ConsumerDaoImpl implements ConsumerDao {

    @Autowired
    private HibernateTransactionManager hibernateTransactionManager;

    private Session currentSession() {
        return hibernateTransactionManager.getSessionFactory().getCurrentSession();
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
