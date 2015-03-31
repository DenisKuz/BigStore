package com.elka.shop.dao.inter;

import com.elka.shop.domain.Consumer;

import java.util.List;

public interface ConsumerDao {

    public void create(Consumer entity);

    public Consumer read(long id);

    public List readAll();
}
