package com.elka.shop.dao.impl;

import com.elka.shop.dao.inter.Dao;
import com.elka.shop.domain.EntityClass;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDaoClass<E extends EntityClass, T> implements Dao<E, T> {
    @Autowired
    private HibernateTransactionManager hibernateTransactionManager;

    protected Session currentSession() {
        return hibernateTransactionManager.getSessionFactory().getCurrentSession();
    }

    @Override
    public void create(E entity) {
        currentSession().save(entity);
    }

    @Override
    @SuppressWarnings("unchecked")
    public E read(T id) {
        //return (E) currentSession().get(GenericTypeResolver.resolveTypeArgument(getClass(), AbstractHibernateTransaction.class), (java.io.Serializable) id);
        Class<E> eClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        return (E) currentSession().get(eClass, (java.io.Serializable) id);
    }

    @Override
    public void delete(E entity) {
        currentSession().delete(entity);
    }

    @Override
    public List<E> readList(List<T> listId) {
        List<E> consumerList = new ArrayList<>(listId.size());
        for (T id : listId) {
            consumerList.add(read(id));
        }
        return consumerList;
    }
}
