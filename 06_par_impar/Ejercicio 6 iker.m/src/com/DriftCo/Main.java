package com.DriftCo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Introduce un valor entero: ");

        int a = Integer.parseInt(br.readLine());



                if (a % 2  == 0 ) {

                    System.out.println("Par");
                }else {
                    System.out.println("Impar");
                }




    }
}
