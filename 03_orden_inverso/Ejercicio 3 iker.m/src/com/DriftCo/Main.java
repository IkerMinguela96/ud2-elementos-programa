package com.DriftCo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("escribe el primer número: ");

        int n1 = Integer.parseInt(br.readLine());

        System.out.println("escribe el segundo número: ");

        int n2 = Integer.parseInt(br.readLine());

        System.out.println("escribe el tercer número: ");

        int n3 = Integer.parseInt(br.readLine());

        System.out.println(n3+" - "+n2+" - "+n1 );




    }
}
