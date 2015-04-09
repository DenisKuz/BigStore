package com.elka.store.webapp.controller;

import com.elka.shop.domain.Consumer;
import com.elka.shop.services.inter.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ConsumerController {
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/first", method = RequestMethod.GET, produces = "text/plain")

    public @ResponseBody String getConsumer(final @RequestParam("login") String login) {
         return consumerService.getConsumerByLogin(login).getPassword();
       // return "33333";
    }
}
