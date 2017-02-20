package com.heri.pu12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto12 {

    public static void main (String[] args ) throws IOException {

        double a,b,c,d,x,cat;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un numero real a");
        a = Double.parseDouble(br.readLine());

        System.out.println("Ingrese un numero real b");
        b = Double.parseDouble(br.readLine());

        System.out.println("Ingrese un numero real c");
        c = Double.parseDouble(br.readLine());

        System.out.println("Ingrese un numero real d");
        d = Double.parseDouble(br.readLine());

        System.out.println("Ingrese un numero real x");
        x = Double.parseDouble(br.readLine());

        if (x > 0){

            cat = (a + b) * (c + d);

        }else if(x == 0){

            cat = (a + b) / (c + d);

        }else{

            cat = (a + b) - (c + d);

        }

        System.out.printf("cat es = "+cat);
    }

}
