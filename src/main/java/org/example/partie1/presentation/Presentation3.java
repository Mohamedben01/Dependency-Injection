package org.example.partie1.presentation;

import org.example.partie1.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation3 {
    public static void main(String[] args) {
        // FrameWork Spring Version XML
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Result: "+metier.calcul());
    }
}
