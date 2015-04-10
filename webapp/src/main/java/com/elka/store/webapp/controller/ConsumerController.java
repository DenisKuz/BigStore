package com.elka.store.webapp.controller;

import com.elka.shop.domain.Consumer;
import com.elka.shop.services.inter.ConsumerService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;
    private final Gson gson = new Gson();

    @RequestMapping(value = "/GetConsumerData", method = RequestMethod.GET, produces = "text/plain")
    @ResponseBody
    public String getConsumer(final @RequestParam("login") String login) throws IOException {
        return convertToJson(consumerService.getConsumerByLogin(login));
    }

    private String convertToJson(Consumer consumerDTO) throws IOException {
        return gson.toJson(consumerDTO);
    }


}
