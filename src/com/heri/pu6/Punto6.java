package com.heri.pu6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto6 {

    public static void main (String[] args ) throws IOException {

        double a,areaCuadrado;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el valor del lado del cuadrado");
        a = Double.parseDouble(br.readLine());

        areaCuadrado = Math.pow(a,2);

        System.out.println("El area del cuadrado es = "+areaCuadrado);

    }

}
