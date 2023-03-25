package org.example.partie2.metier;

import org.example.partie2.dao.HDMI;
import org.example.partie2.dao.VGA;
import org.springframework.stereotype.Component;

@Component
public class Adaptateur implements VGA {
    private HDMI hdmi;

    public Adaptateur(HDMI hdmi) {
        this.hdmi = hdmi;
    }

    //HDMI TO VGA
    @Override
    public void print(String message) {
        byte[] data = message.getBytes();
        hdmi.print(data);
    }
}
