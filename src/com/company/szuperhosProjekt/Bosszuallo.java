package com.company.szuperhosProjekt;

public abstract class Bosszuallo implements Szuperhos{
    protected double szuperero;
    protected boolean vanEGyengesege;

    public Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos szuperhos) {
        if (this.vanEGyengesege == true && szuperhos.mekkoraAzEreje() < this.szuperero) {
            return true;
        }
        else if (this.szuperero > 2 * szuperhos.mekkoraAzEreje()) {
            return true;
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }

    @Override
    public String toString() {
        return String.format("Bosszúalló: %f - van gyengesége: %s", this.szuperero, this.vanEGyengesege == true ? "Van" : "Nincs");

    }
}
