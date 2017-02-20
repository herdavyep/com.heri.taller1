package com.heri.pu14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto14 {

    public static void main (String[] args ) throws IOException {

        double a;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un numero real a");
        a = Double.parseDouble(br.readLine());

        if (a > 100){

            a = a + 20;

        }else if(a == 100){

            a = a + 1;

        }else{

             a = a - 20;
        }

        System.out.printf("El numero 'a' ahora vale "+a);

    }

}
