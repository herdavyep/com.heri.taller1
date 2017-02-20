package com.heri.pu30;

import java.io.IOException;

/**
 * Created by heribertodavid on 19/02/17.
 */
public class Punto30 {

    public static void main (String[] args ) throws IOException {

        int columna = 8,fila = 8;

        int [][] matriA = new int[8][8];

        System.out.println("\nValores de matris cuadrada A (4x4)\n");

        for (int x = 0; x <= fila; x++){

            for (int y = 0; y <= columna; y++){

                if (x == y){

                    System.out.printf("0");

                }else if (x+1 == y){

                    System.out.printf("1");

                }else if (x + 2 == y){

                    System.out.printf("2");

                } else {

                    System.out.printf("3");

                }

            }

            System.out.println("");

        }

    }

}
