package org.example.partie1.presentation;

import org.example.partie1.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Presentation4 {
    public static void main(String[] args) {
        // FrameWork Spring Version Annotations
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Result: "+metier.calcul());
    }
}
