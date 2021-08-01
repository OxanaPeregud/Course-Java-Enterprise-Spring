package com.peregud.interception;

import org.springframework.aop.framework.ProxyFactory;

public class App {
    private static SenderService target;
    private static SenderService proxy;

    public static void init() {
        target = new SenderService();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(new MessageInterceptor());
        proxyFactory.setTarget(target);
        proxy = (SenderService) proxyFactory.getProxy();
    }

    public static void main(String[] args) {
        init();
        process(new Message("Sender message"));
        System.out.println("----- BACK DOOR -----");
        processProxy(new Message("Sender message"));

    }

    public static void process(Message message) {
        target.send(message);
    }

    public static void processProxy(Message message) {
        proxy.send(message);
    }
}
