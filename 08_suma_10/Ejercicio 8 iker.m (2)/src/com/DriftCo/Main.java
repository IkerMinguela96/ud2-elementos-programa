package com.DriftCo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int suma = 0;

        int n;

        for (int i = 0; i < 3; i++) {

            System.out.println("Escribe un numero: ");

            n = Integer.parseInt(br.readLine());

            suma = suma + n;
        }

        System.out.println(suma);
    }
}
