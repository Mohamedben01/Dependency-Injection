package org.example.partie1.dao;


import org.springframework.stereotype.Component;

import java.util.Date;

@Component("dao")
public class IDaoImpl implements  IDao{
    @Override
    public Date getDate() {
        return new Date();
    }
}
