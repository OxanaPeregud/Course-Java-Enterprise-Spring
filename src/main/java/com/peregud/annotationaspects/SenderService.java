package com.peregud.annotationaspects;

import org.springframework.stereotype.Service;

@Service
public class SenderService {

    public void send(Message message) {
        System.out.println(message);
    }

    public void sendException() throws Exception {
        System.out.println("Can't send message");
        throw new Exception("Throwing exception");
    }
}
