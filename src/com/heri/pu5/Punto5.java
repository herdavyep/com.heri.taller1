package com.heri.pu5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto5 {

    public static void main (String[] args ) throws IOException {

        double a,b,suma,resta1,resta2,multiplicacion,division;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresa un numero real a");
        a = Double.parseDouble(br.readLine());

        System.out.println("Ingresa un numero real b");
        b = Double.parseDouble(br.readLine());

        division=1;

        suma = a + b;
        resta1 = a - b;
        resta2 = b - a;
        multiplicacion = a * b;

        System.out.println("la suma de "+a+" + "+b+" es = "+suma);
        System.out.println("la resta de "+a+" - "+b+" es = "+resta1);
        System.out.println("la resta de "+b+" - "+a+" es = "+resta2);
        System.out.println("la multiplicacion de "+a+" * "+b+" es = "+multiplicacion);

        if (b != 0){

            division = a / b;
            System.out.println("la division de "+a+" entre "+b+" es = "+division);


        }else{

            System.out.println("No se puede dividir entre 0 'cero' ");
        }

    }

}

