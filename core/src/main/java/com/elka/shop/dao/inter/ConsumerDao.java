package com.elka.shop.dao.inter;

import com.elka.shop.domain.Consumer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ConsumerDao extends Dao {

    @Transactional(readOnly = true)
    List<Consumer> read(List<String> id);
}


