package com.heri.pu21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 19/02/17.
 */
public class Punto21 {

    public static void main (String[] args ) throws IOException {

        double numeroN,numN;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Numero real");
        numeroN = Double.parseDouble(br.readLine());

        numN = numeroN;

        while (numeroN > 0 ){

            System.out.println(numeroN+" - 2 = "+(numeroN-2));

            numeroN = numeroN - 2;

        }

        if (numeroN != 0){

            System.out.printf("El "+numN+" es impar");

        }else {

            System.out.println("El "+numN+" es par");

        }
    }
}
