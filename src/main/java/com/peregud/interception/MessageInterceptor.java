package com.peregud.interception;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MessageInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object[] args = invocation.getArguments();
        Message message = (Message) args[0];
        System.out.println("Message '" + message.getMessage() + "' was intercepted");
        return invocation.proceed();
    }
}
