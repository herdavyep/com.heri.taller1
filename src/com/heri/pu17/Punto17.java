package com.heri.pu17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto17 {

    public static void main (String[] args ) throws IOException {

        char letra;
        boolean estado;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un numero o una vocal");
        letra=(char)System.in.read();

        if(!Character.isDigit(letra)){

            System.out.println("Es una vocal");

        }else {

            System.out.printf("Es un numero");

        }




    }

}
