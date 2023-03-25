package org.example.partie2.dao;

import org.springframework.stereotype.Component;

@Component
public class Clavier implements USB{
    @Override
    public int read() {
        return 1;
    }
}
