package com.DriftCo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("introduce un número: ");

        int a = Integer.parseInt(br.readLine());

        System.out.println("introduce otro número: ");

        int b = Integer.parseInt(br.readLine());

        int t = b * a;

        System.out.println( "el resultado es :"+t);




    }
}
