package com.heri.pu24;

import java.io.IOException;

/**
 * Created by heribertodavid on 19/02/17.
 */
public class Punto24 {

    public static void main (String[] args ) throws IOException {

        double añoInicio = 1616,añoFinal = 1976,valorIsla = 24,interes,acumulador = 0,nuevoPrecio;

        for (int i = 1; i <= añoFinal-añoInicio; i++){

            interes = valorIsla * 0.12;
            nuevoPrecio = interes + valorIsla;
            valorIsla = nuevoPrecio;
        }

        System.out.println("El capital es de $"+valorIsla);

    }
}
