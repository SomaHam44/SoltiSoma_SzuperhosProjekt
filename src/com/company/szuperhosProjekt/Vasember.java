package com.company.szuperhosProjekt;

import java.util.Random;

public class Vasember extends Bosszuallo implements Milliardos{
    private Random veletlen;


    public Vasember() {
        super(150, true);
        this.veletlen = new Random();
    }

    @Override
    public void kutyutKeszit() {
        double novekedik = veletlen.nextDouble() * 10+1;
        this.szuperero += novekedik;



    }


    @Override
    public boolean megmentiAVilagot() {
        if (this.getSzuperero() > 1000) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vasember : " + super.toString();
    }
}
