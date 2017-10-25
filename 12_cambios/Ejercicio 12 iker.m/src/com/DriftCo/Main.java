package com.DriftCo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double p;
        double c;

        int precio;
        int cant;

        System.out.println(" escribe el precio del producto en euros (ej.1,25): ");
        p = Double.parseDouble(br.readLine());

        do {

            System.out.println(" escribe la cantidad introducida (ej.2,0) ");
            c = Double.parseDouble(br.readLine());

            cant = (int)(c*100);

            precio = (int)(p*100);

            if(!(c > p && c % 5 == 0)){

                System.out.println(" cantidad insuficiente o no es multiplo de 5 ");
            }

        } while (!(c > p && (c * 100) % 5 == 0));

        if ( c == p ){

            System.out.println(" importe exacto");
        }else{

            int e  = ( cant - precio );

            int m = e / 200;

            System.out.println(" monedas de 2€: " + m);

            e = e % 200;

            m = e / 100;

            System.out.println(" monedas de 1 €: " + m);

            e = e % 100;

            m = e / 50;

            System.out.println(" monedas de 0,50€: " + m);

            e = e % 50;

            m = e / 20;

            System.out.println(" monedas de 0,20€: " + m);

            e = e % 20;

            m = e / 10;

            System.out.println(" monedas de 0,10€: " + m);

            e = e % 10;

            m = e / 5;

            System.out.println(" monedas de 0,05€: " + m);








        }








    }
}
