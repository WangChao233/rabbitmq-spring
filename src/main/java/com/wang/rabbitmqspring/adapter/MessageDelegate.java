package com.wang.rabbitmqspring.adapter;

public class MessageDelegate {
    /*public void handleMessage(String messageBody){
        System.out.println("默认方法，消息内容："+new String(messageBody));
    }*/
    public void consumeMessage(String messageBody){
        System.out.println("默认方法，消息内容string："+messageBody);
    }

    public void consumeMessage(byte[] messageBody){
        System.out.println("默认方法，消息内容Message："+new String(messageBody));
    }
}
