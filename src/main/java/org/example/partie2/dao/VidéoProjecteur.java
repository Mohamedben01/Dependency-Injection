package org.example.partie2.dao;

import org.springframework.stereotype.Component;

@Component
public class VidéoProjecteur implements VGA{

    @Override
    public void print(String message) {
        System.out.println("Je suis une vidéo projecteur: "+message);
    }
}
