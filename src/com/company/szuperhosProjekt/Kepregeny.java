package com.company.szuperhosProjekt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Kepregeny {
    public static List<Szuperhos> hosok;

    public Kepregeny() {
        hosok = new ArrayList<>();
        szereplok("");
        szuperhosok();
    }


    public static void szereplok(String eleresiUt) {
        try{
            FileReader fr = new FileReader(eleresiUt);
            BufferedReader br = new BufferedReader(fr);
            String sor = br.readLine();
            while (sor != null) {
                String[] st = sor.split(" ");
                if (st[0].equals("Vasember")) {
                    Vasember v = new Vasember();
                    for (int i = 0; i < Integer.parseInt(st[1]); i++) {
                        v.kutyutKeszit();

                    }
                    hosok.add(v);

                }
                else if (st[0].equals("Batman")) {
                    Batman b= new Batman();
                    for (int i = 0; i < Integer.parseInt(st[1]); i++) {
                        b.kutyutKeszit();
                    }
                    hosok.add(b);
                }
                else {
                    System.out.println("Nem megfelelő név!");
                }

                sor = br.readLine();
            }

            br.close();
            fr.close();


        }
        catch (IOException e) {
            e.getMessage();
        }



    }

    public static void szuperhosok() {


        for (Szuperhos hos : hosok) {
            System.out.println(hos.toString());
        }

    }


}
