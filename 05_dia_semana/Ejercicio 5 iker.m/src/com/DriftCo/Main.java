package com.DriftCo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        int a;

        do {
            System.out.println("Escribe un valor numérico entre el 1 y el 7");
            a = Integer.parseInt(br.readLine());

        }while (a< 1 || a > 7);

        switch (a){
            case 1:
                System.out.println(" Lunes");
                break;
            case 2:
                System.out.println(" Martes");
                break;
            case 3:
                System.out.println(" Miercoles");
                break;
            case 4:
                System.out.println(" Jueves");
                break;
            case 5:
                System.out.println(" Viernes");
                break;
            case 6:
                System.out.println(" Sabado");
                break;
            case 7:
                System.out.println(" Domingo");
                break;
        }


    }
}
