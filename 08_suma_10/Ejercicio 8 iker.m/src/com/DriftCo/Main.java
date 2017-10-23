package com.DriftCo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("escribe el primer numero de la suma de 10 numeros:");

        int a = Integer.parseInt(br.readLine());

        System.out.println("escribe el segundo numero de la suma de 10 numeros:");

        int b = Integer.parseInt(br.readLine());

        System.out.println("escribe el tercer numero de la suma de 10 numeros:");

        int c = Integer.parseInt(br.readLine());

        System.out.println("escribe el cuarto numero de la suma de 10 numeros:");

        int d = Integer.parseInt(br.readLine());

        System.out.println("escribe el quinto numero de la suma de 10 numeros:");

        int e = Integer.parseInt(br.readLine());

        System.out.println("escribe el sexto numero de la suma de 10 numeros:");

        int f = Integer.parseInt(br.readLine());

        System.out.println("escribe el septimo numero de la suma de 10 numeros:");

        int g = Integer.parseInt(br.readLine());

        System.out.println("escribe el octavo numero de la suma de 10 numeros:");

        int h = Integer.parseInt(br.readLine());

        System.out.println("escribe el noveno numero de la suma de 10 numeros:");

        int i = Integer.parseInt(br.readLine());

        System.out.println("escribe el décimo numero de la suma de 10 numeros:");

        int j = Integer.parseInt(br.readLine());

        System.out.println(a + b + c + d + e + f + g + h + i + j);
    }
}
