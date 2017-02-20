package com.heri.pu28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 19/02/17.
 */
public class Punto28 {

    public static void main (String[] args ) throws IOException {

        int [][] matriA = new int[4][4];
        int [] sumafilas = new int[4];
        int [] sumaColumnas = new int[4];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nValores de matris cuadrada A (4x4)\n");

        for (int x = 0; x <= 3; x++){

            for (int y = 0; y <= 3; y++){

                System.out.printf("Posicion ["+x+","+y+"]:\t");
                matriA[x][y] = Integer.parseInt(br.readLine());

            }

        }

        for (int x = 0; x <= 3; x++){

            sumafilas[x] = 0;

            for (int y = 0; y <= 3; y++){

                sumafilas[x] = sumafilas[x] + matriA[x][y];
            }
        }

        for (int x = 0; x <= 3; x++){

            sumaColumnas[x] = 0;

            for (int y = 0; y <= 3; y++){

                sumaColumnas[x] = sumaColumnas[x] + matriA[y][x];
            }
        }

        System.out.println("\nMatris\n");

        for (int x = 0; x <= 3; x++){

            for (int y = 0; y <= 3; y++){

                System.out.printf(""+matriA[x][y]);
            }

            System.out.println("");
        }

        System.out.println("\nSuma filas de la matris en vector\n");

        for (int x = 0; x <= 3; x++){

            System.out.println(""+sumafilas[x]);

        }

        System.out.println("\nSuma columnas de la matris en vector\n");

        for (int x = 0; x <= 3; x++){

            System.out.println(""+sumaColumnas[x]);

        }

    }

}
