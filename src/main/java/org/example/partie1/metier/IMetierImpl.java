package org.example.partie1.metier;

import org.example.partie1.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;

@Component("metier")
public class IMetierImpl implements IMetier{
    @Autowired
    private IDao dao; // Couplage Faible

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public Date calcul() {
        Date currentDate = dao.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        cal.add(Calendar.DAY_OF_MONTH, 7);
        return cal.getTime();
    }
}
