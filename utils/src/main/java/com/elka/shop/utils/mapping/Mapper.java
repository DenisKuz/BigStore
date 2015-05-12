package com.elka.shop.utils.mapping;

import net.sf.brunneng.jom.IMergingContext;
import net.sf.brunneng.jom.MergingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    private static IMergingContext mergingContext = new MergingContext();

    public static  <D, S> D map(S source, Class<D> dClass) {
        return mergingContext.map(source, dClass);
    }
}
