package org.example.partie2.metier;

import org.example.partie2.dao.USB;
import org.example.partie2.dao.VGA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UnitéCentrale{

    private VGA vga;
    private USB usb;

    public UnitéCentrale(VGA vga, USB usb) {
        this.vga = vga;
        this.usb = usb;
    }

    @Autowired
    public void setVga(VGA vga) {
        this.vga = vga;
    }

    @Autowired
    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public int readData() {
        return usb.read();
    }

    public void printData(String data) {
        vga.print(data);
    }
}
