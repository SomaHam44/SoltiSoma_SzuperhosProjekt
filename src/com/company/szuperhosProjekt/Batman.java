package com.company.szuperhosProjekt;

public class Batman implements Szuperhos, Milliardos{
    private double lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;

    }

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (szuperhos.mekkoraAzEreje() < this.lelemenyesseg) {
            return true;
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return 2 * this.lelemenyesseg;
    }

    @Override
    public String toString() {
        return String.format("Batman: %f", this.lelemenyesseg);
    }
}
