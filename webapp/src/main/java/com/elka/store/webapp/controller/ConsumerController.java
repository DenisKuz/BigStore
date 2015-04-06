package com.elka.store.webapp.controller;

import com.elka.shop.domain.Consumer;
import com.elka.shop.services.inter.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

   @RequestMapping(value = "/elka/store")
    public Consumer getConsumer(final HttpServletRequest request){
        return consumerService.getConsumerByLogin("ivan");
    }
}
