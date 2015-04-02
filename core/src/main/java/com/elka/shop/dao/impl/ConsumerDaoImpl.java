package com.elka.shop.dao.impl;

import com.elka.shop.dao.inter.ConsumerDao;
import com.elka.shop.domain.Consumer;
import com.elka.shop.domain.EntityClass;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ConsumerDaoImpl extends AbstractHibernateTransaction<Consumer, String> implements ConsumerDao {

}
