package com.elka.shop.dao.inter;

import com.elka.shop.domain.EntityClass;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface Dao {

    public void create(EntityClass entity);

    @Transactional(readOnly = true)
    public EntityClass read(Object id);

    public void delete(EntityClass entity);
}
