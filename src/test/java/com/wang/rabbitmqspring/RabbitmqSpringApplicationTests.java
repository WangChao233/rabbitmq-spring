package com.wang.rabbitmqspring;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RabbitmqSpringApplication.class})
public class RabbitmqSpringApplicationTests {

    @Autowired
    private RabbitAdmin rabbitAdmin;
    @Test
    public void testAdmin() throws Exception{
        rabbitAdmin.declareExchange(new DirectExchange("test.direct",false,false));
    }
}
