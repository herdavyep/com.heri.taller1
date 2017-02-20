package com.heri.pu26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 19/02/17.
 */
public class Punto26 {

    public static void main (String[] args ) throws IOException {

        int kilometros = 0,contadorKilometrosBien = 0,contadorKilometrosRapido = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (kilometros < 161){

            System.out.println("Kilometros ");
            kilometros = Integer.parseInt(br.readLine());

            if (kilometros <= 90){

                contadorKilometrosBien = contadorKilometrosBien + 1;
                System.out.println("BIEN");

            }else{

                contadorKilometrosRapido = contadorKilometrosRapido +1;
                System.out.println("RAPIDO");

            }
        }

        System.out.println("El numero de velocidades bien es "+contadorKilometrosBien);
        System.out.println("El numero de velocidades rapidas es "+contadorKilometrosRapido);

    }
}
