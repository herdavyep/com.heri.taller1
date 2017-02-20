package pu10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto10 {

    public static void main (String[] args ) throws IOException {

        int numeroEntero,valorAbsoluto;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese un numero entero");
        numeroEntero = Integer.parseInt(br.readLine());

        valorAbsoluto = Math.abs(numeroEntero);

        System.out.println("el valor absoluto de "+numeroEntero+" es "+valorAbsoluto);

    }

}
