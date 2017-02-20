package com.heri.pu1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;

/**
 * Created by heribertodavid on 17/02/17.
 */
public class Punto1 {

   public static void main (String[] args ) throws IOException {

       double a;
       double cubo,cuadrado;

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("ingrese un numero real");

       a = Double.parseDouble(br.readLine());

       cubo = Math.pow(a,3);
       cuadrado = Math.pow(a,2);

       System.out.println("El cuadrado de "+a+ " es "+cuadrado);
       System.out.println("El cubo de "+a+ " es "+cubo);

   }



}
