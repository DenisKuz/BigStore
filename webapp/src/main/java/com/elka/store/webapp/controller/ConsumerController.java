package com.elka.store.webapp.controller;

import com.elka.shop.domain.Consumer;
import com.elka.shop.services.inter.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/GetConsumerData", method = GET)
    @ResponseBody
    public Consumer getConsumer(final @RequestParam("login") String login) throws IOException {
        return consumerService.getConsumerByLogin(login);
    }

    @RequestMapping(value = "/Entry", method = POST)
    @ResponseBody
    public String checkEntry(@RequestBody final Consumer consumer) {
        return consumerService.checkConsumer(consumer.getLogin(), consumer.getPassword());
    }
}
