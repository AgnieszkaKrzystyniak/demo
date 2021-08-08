package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Random;

@Component
@RequestScope
public class RandomNumberProvider {
    private final int value = new Random().nextInt();

    public int getValue() {

        return value;
    }
}