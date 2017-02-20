package com.heri.pu15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto15 {

    public static void main (String[] args ) throws Exception {

        double []a = new double[3];
        double mayor,menor;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       for (int i = 0; i <= 2; i++ ){

           System.out.println("Ingrese un numero real x"+i);
           a[i] = Double.parseDouble(br.readLine());
       }

        mayor = a[0];
        menor = a[0];

        for (int i = 0; i <= 2; i++){

            if (a[i] > mayor){

                mayor = a[i];
            }
            if (a[i] < menor){

                menor = a[i];

            }

        }

        System.out.println("El numero mayor es "+mayor);
        System.out.println("El numero menor es "+menor);

    }

}
