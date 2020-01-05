package com.wang.rabbitmqspring;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {RabbitmqSpringApplication.class})
public class RabbitmqSpringApplicationTests {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private RabbitAdmin rabbitAdmin;
    @Test
    public void sendMessage() throws Exception{
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setContentType("text/plain");
        Message message =new Message("mq 消息1234".getBytes(),messageProperties);
        rabbitTemplate.send("topic001","rabbit.1",message);
        rabbitTemplate.convertAndSend("topic001","rabbit.1","message send");
    }
}
