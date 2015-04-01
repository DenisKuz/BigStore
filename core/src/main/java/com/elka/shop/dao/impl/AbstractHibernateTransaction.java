package com.elka.shop.dao.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;

public abstract class AbstractHibernateTransaction {
    @Autowired
    private HibernateTransactionManager hibernateTransactionManager;

    protected Session currentSession() {
        return hibernateTransactionManager.getSessionFactory().getCurrentSession();
    }
}
