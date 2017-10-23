package com.DriftCo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("escribe un número para indicar su valor absoluto, si quiere terminar escriba el valor cero: ");
        int n = Integer.parseInt(br.readLine());

        while (n != 0) {

            if (n < 0) {
                n = n * (-1);
            }

            System.out.println(" el valor absoluto es  " + n);

            System.out.println("escribe un número para indicar su valor absoluto, si quiere terminar escriba el valor cero: ");
            n = Integer.parseInt(br.readLine());
        }


    }
}
