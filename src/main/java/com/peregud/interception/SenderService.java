package com.peregud.interception;

import lombok.Data;

@Data
public class SenderService {

    public void send(Message message) {
        System.out.println(message);
    }
}
