package com.udemy.courses.javadesignpatterns.behavioral.chainofresponsibility;

public class AuthenticationHandleer implements HandlerChain {

    String token;
    public HandlerChain next;

    public AuthenticationHandleer(String token) {
        this.token = token;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\nAuthentication: " + token;
        if (next == null) {
            return outputHeader;
        } else {
            return next.addHandler(outputHeader);
        }
    }

}
