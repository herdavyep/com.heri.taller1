package com.heri.pu27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 19/02/17.
 */
public class Punto27 {

    public static void main (String[] args ) throws IOException {

        double [] numeros = new double[5];
        double acomulador = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese 5 numeros");

        for (int i = 0; i <= 4; i++){

            System.out.printf("Posicion "+i+":\t");
            numeros[i] = Double.parseDouble(br.readLine());
            acomulador = acomulador + numeros[i];

        }

        for (int i = 0; i <= 4; i++){

            System.out.println(""+numeros[i]);
        }

        System.out.printf("La suma del vector es "+acomulador);

    }

}
