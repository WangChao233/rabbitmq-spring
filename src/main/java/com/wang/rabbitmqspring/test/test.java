package com.wang.rabbitmqspring.test;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;

public class test {
    @Autowired
    private RabbitAdmin rabbitAdmin;


    public void testAdmin() throws Exception{
        rabbitAdmin.declareExchange(new DirectExchange("test.direct",false,false));
    }
}
