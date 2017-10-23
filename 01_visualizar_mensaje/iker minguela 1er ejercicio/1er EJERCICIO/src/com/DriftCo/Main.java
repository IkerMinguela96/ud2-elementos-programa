package com.DriftCo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        System.out.println("Escribe algo: ");

        //Pantalla
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Teclado
        String mensaje = br.readLine();

        //Pantalla
        System.out.println("El mensaje es: " +mensaje);

    }
}
