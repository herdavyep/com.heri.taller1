package com.heri.pu11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto11 {

    public static void main (String[] args ) throws IOException {

        int a,b,c,d;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un numero entero a");
        a = Integer.parseInt(br.readLine());

        System.out.println("Ingrese un numero entero b");
        b = Integer.parseInt(br.readLine());

        System.out.println("Ingrese un numero entero c");
        c = Integer.parseInt(br.readLine());

        System.out.println("Ingrese un numero entero d");
        d = Integer.parseInt(br.readLine());

        if (b != 0 && d != 0){

            if (a / b == c / d){

                System.out.println("SI");

            }else {

                System.out.printf("NO");
            }

        }else {

            System.out.printf("indefinido");
        }

    }

}
