package com.company.szuperhosProjekt;


public class Main {

    public static void main(String[] args) {
        Kepregeny kepregeny = new Kepregeny();
       try {
            kepregeny.szereplok("szuperhos.txt");
            kepregeny.szuperhosok();



        }
        catch (Exception e) {
            System.out.println("Hibát tapasztaltunk");
        }

    }
}
