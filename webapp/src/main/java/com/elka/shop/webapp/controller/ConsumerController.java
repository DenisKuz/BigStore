package com.elka.shop.webapp.controller;

import com.elka.shop.domain.Consumer;
import com.elka.shop.services.inter.ConsumerService;
import com.elka.shop.utils.mapping.Mapper;
import com.elka.shop.webapp.dto.ConsumerDTO;
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
    public String checkEntry(@RequestBody final ConsumerDTO consumerDTO) {
        Consumer consumer = Mapper.map(consumerDTO, Consumer.class);
        return consumerService.checkSecurityConsumerData(consumer.getLogin(), consumer.getPassword());
    }

    @RequestMapping(value = "/Registration", method = POST)
    public void registration(@RequestBody final ConsumerDTO consumerDTO) {
        Consumer consumer = Mapper.map(consumerDTO, Consumer.class);
        consumerService.save(consumer);
    }

    @RequestMapping(value = "/CheckLogin", method = GET)
    @ResponseBody
    public String checkLogin(@RequestParam("login") String login){
        return consumerService.checkLogin(login);
    }
}
