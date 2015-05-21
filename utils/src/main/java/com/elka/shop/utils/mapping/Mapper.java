package com.elka.shop.utils.mapping;

import net.sf.brunneng.jom.IMergingContext;
import net.sf.brunneng.jom.MergingContext;

public class Mapper {
    private static IMergingContext mergingContext = new MergingContext();

    public static  <D, S> D map(S source, Class<D> dClass) {
        return mergingContext.map(source, dClass);
    }
}
