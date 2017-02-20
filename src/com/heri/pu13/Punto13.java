package com.heri.pu13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto13 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a,b,c,d,x1,x2;

        System.out.println("Ecuacion cuadratica");

        System.out.println("Ingresar valor de  a ");
        a = Double.parseDouble(br.readLine());

        System.out.println("Ingresar valor de  b ");
        b = Double.parseDouble(br.readLine());

        System.out.println("Ingresar valor de  c ");
        c = Double.parseDouble(br.readLine());

        d= Math.pow(b,2) - (4*a*c);

        if(d < 0 )
        {
            System.out.println("Incorrecto");
        }
        else
        {
            x1 = (-b + Math.sqrt(d)) / 2 * a;
            x2 = (-b - Math.sqrt(d)) / 2 * a;

            System.out.println("x1 "+x1);
            System.out.println("x2 "+x2);
        }

    }

}
