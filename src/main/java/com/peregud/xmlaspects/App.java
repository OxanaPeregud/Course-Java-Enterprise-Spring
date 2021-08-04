package com.peregud.xmlaspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("xml-aspects.xml");
        SenderService senderService = context.getBean(SenderService.class);
        senderService.send(new Message("Message"));
        senderService.sendException();
    }
}
