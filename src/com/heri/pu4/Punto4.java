package com.heri.pu4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by marianadavid on 19/02/17.
 */
public class Punto4 {

    public static void main (String[] args ) throws IOException {

        double a,b,c,x,y;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresa un numero real a");
        a = Double.parseDouble(br.readLine());

        System.out.println("Ingresa un numero real b");
        b = Double.parseDouble(br.readLine());

        System.out.println("Ingresa un numero real c");
        c = Double.parseDouble(br.readLine());

        System.out.println("Ingresa  un numero real x");
        x = Double.parseDouble(br.readLine());

        //y = a*x*2 + b*x + c; tambien sirve esta exprecion ??
        y = (((a*x)*2) + (b*x) + c);

        System.out.println("El valor de y es = "+y);


    }
}
