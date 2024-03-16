package com.webscoket.chatapplication.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {

    private String senderName;
    private String content;
}
