package com.DriftCo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("escribe la base del triangulo: ");
        int b = Integer.parseInt(br.readLine());


        System.out.println("escribe la altura del triangulo: ");
        int h = Integer.parseInt(br.readLine());

        int area = b * h / 2;

        System.out.println("el area del triangulo es: "+ area);

        //System.out.println("el area del triangulo es: "+ b * h / 2);

    }
}
