package com.webscoket.chatapplication.controller;

import com.webscoket.chatapplication.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {


    @MessageMapping("/message") /* Sender will send the message on this endpoint*/
    @SendTo("/message/subscribe") /* the message will receive by one who subscribe the endpoint*/
    public Message getContent(@RequestBody Message message){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        return message;
    }
}
