package org.example.partie2.dao;

import org.springframework.stereotype.Component;

@Component
public class Ecran implements VGA{
    @Override
    public void print(String message) {
        System.out.println("Je suis un écran: "+message);
    }
}
