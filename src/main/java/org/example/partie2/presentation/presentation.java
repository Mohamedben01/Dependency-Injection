package org.example.partie2.presentation;


import org.example.partie2.metier.UnitéCentrale;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presentation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        UnitéCentrale unitéCentrale = context.getBean(UnitéCentrale.class);
        unitéCentrale.printData("Hello I am Mohamed");
        System.out.println(unitéCentrale.readData());
    }
}
