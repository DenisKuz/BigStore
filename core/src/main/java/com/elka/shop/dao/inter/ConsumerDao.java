package com.elka.shop.dao.inter;

import com.elka.shop.domain.Consumer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ConsumerDao {

    public void create(Consumer entity);

    public Consumer read(long id);

    public List readAll();
}
