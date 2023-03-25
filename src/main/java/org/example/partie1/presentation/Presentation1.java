package org.example.partie1.presentation;

import org.example.partie1.dao.IDaoImpl;
import org.example.partie1.metier.IMetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        // Instanciation Statique
        IDaoImpl dao = new IDaoImpl();
        IMetierImpl metier = new IMetierImpl();
        metier.setDao(dao); // Injection des dépendances statique
        System.out.println("Result: "+metier.calcul());
    }
}
