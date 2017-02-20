package com.heri.pu19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 19/02/17.
 */

public class Punto19 {


    public static void main (String[] args ) throws IOException {

        double []a = new double[10];
        double acumuladorNegtivos,acumuladorpositivos,contadorCeros;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <= 9; i++ ){

            System.out.println("Ingrese un numero real x"+i);
            a[i] = Double.parseDouble(br.readLine());
        }

        acumuladorNegtivos = 0;
        acumuladorpositivos = 0;
        contadorCeros = 0;

        for (int i = 0; i <= 9; i++){

            if (a[i] < 0) {

                acumuladorNegtivos = acumuladorNegtivos + a[i];

            }else if (a[i] > 0){

                   acumuladorpositivos = acumuladorpositivos + a[i];

            }else {

                contadorCeros = contadorCeros + 1;

            }

        }

        System.out.println("Los negativos suman "+acumuladorNegtivos);
        System.out.println("Los positivos suman "+acumuladorpositivos);
        System.out.println("La cantidad de ceros es "+contadorCeros);
    }

}
