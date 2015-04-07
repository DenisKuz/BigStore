package com.elka.store.webapp.controller;

import com.elka.shop.domain.Consumer;
import com.elka.shop.services.inter.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

   /*@RequestMapping(value = "/first")
    public Consumer getConsumer(final HttpServletRequest request){
        return consumerService.getConsumerByLogin("ivan");
    }*/
}
