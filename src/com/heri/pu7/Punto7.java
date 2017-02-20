package com.heri.pu7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto7 {

    public static void main (String[] args ) throws IOException {

        double a,b,raizSumaCatetos,cuadradoDeA,cuadradoDeB,hipotenusa;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el valor del cateto a");
        a = Double.parseDouble(br.readLine());

        System.out.println("Ingrese el valor del cateto b");
        b = Double.parseDouble(br.readLine());

        cuadradoDeA = Math.pow(a,2);
        cuadradoDeB = Math.pow(b,2);

        raizSumaCatetos = cuadradoDeA + cuadradoDeB;

        hipotenusa = Math.sqrt(raizSumaCatetos);

        System.out.printf("La hipotenusa es = "+hipotenusa);

    }

}
