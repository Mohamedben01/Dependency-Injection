package org.example.partie2.dao;

import org.springframework.stereotype.Component;

@Component
public class Souris implements USB{
    @Override
    public int read() {
        return 1;
    }
}
