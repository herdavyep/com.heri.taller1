package com.heri.pu2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 17/02/17.
 */
public class Punto2 {



    public static void main (String[] args ) throws Exception {

        double a,b,c,d,r;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresa el numero a");
        a = Double.parseDouble(br.readLine());

        System.out.println("Ingresa el numero b");
        b = Double.parseDouble(br.readLine());

        System.out.println("Ingresa el numero c");
        c = Double.parseDouble(br.readLine());

        System.out.println("Ingresa el numero d");
        d = Double.parseDouble(br.readLine());

        r = ( a + b / c ) * d;

        System.out.println("El numero r es = "+r);
    }
}
