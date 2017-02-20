package com.heri.pu29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 19/02/17.
 */
public class Punto29 {

    public static void main (String[] args ) throws IOException {

        int columna = 1,fila = 1;

        int [][] matriA = new int[4][4];
        int [][] matriB = new int[4][4];
        int [][] sumaMatrices = new int[4][4];
        int [][] restaMatrices = new int[4][4];
        int [][] restaMatrices2 = new int[4][4];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nValores de matris cuadrada A (4x4)\n");

        for (int x = 0; x <= fila; x++){

            for (int y = 0; y <= columna; y++){

                System.out.printf("Posicion ["+x+","+y+"]:\t");
                matriA[x][y] = Integer.parseInt(br.readLine());

            }

        }

        System.out.println("\nValores de matris cuadrada B (4x4)\n");

        for (int x = 0; x <= fila; x++){

            for (int y = 0; y <= columna; y++){

                System.out.printf("Posicion ["+x+","+y+"]:\t");
                matriB[x][y] = Integer.parseInt(br.readLine());

            }

        }

        for (int x = 0; x <= fila; x++) {

            for (int y = 0; y <= columna; y++) {

                sumaMatrices[x][y] = matriB[x][y] + matriA[x][y];
            }
        }

        for (int x = 0; x <= fila; x++) {

            for (int y = 0; y <= columna; y++) {

                restaMatrices2[x][y] = matriB[x][y] - matriA[x][y];
            }
        }

        for (int x = 0; x <= fila; x++) {

            for (int y = 0; y <= columna; y++) {

                restaMatrices[x][y] = matriA[x][y] - matriB[x][y];
            }
        }

        System.out.println("\nSuma de las matrices A + B\n");

        for (int x = 0; x <= fila; x++){

            for (int y = 0; y <= columna; y++){

                System.out.printf(""+matriA[x][y]);
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(" ");
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(""+matriB[x][y]);
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(" ");
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(""+sumaMatrices[x][y]);
            }

            System.out.println("");
        }

        System.out.println("\nResta de las matrices A - B\n");

        for (int x = 0; x <= fila; x++){

            for (int y = 0; y <= columna; y++){

                System.out.printf(""+matriA[x][y]);
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(" ");
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(""+matriB[x][y]);
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(" ");
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(""+restaMatrices[x][y]);
            }

            System.out.println("");
        }

        System.out.println("\nResta de las matrices B - A\n");

        for (int x = 0; x <= fila; x++){

            for (int y = 0; y <= columna; y++){

                System.out.printf(""+matriB[x][y]);
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(" ");
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(""+matriA[x][y]);
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(" ");
            }

            for (int y = 0; y <= fila; y++){

                System.out.printf(""+restaMatrices2[x][y]);
            }

            System.out.println("");
        }
    }
}

