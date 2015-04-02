package com.elka.shop.dao.inter;

import com.elka.shop.domain.EntityClass;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface Dao<E extends EntityClass, T> {

    public void create(E entity);

    @Transactional(readOnly = true)
    public E read(T id);

    @Transactional(readOnly = true)
    List<E> readList(List<T> listId);

    public void delete(EntityClass entity);
}
