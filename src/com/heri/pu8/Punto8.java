package com.heri.pu8;

import java.io.IOException;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto8 {

    public static void main (String[] args ) throws IOException {

        double altura,gravedad,velocidadImpacto,raizDe;

        altura = 1454.0;
        gravedad = 32.0;

        raizDe = 2*altura*gravedad;

        velocidadImpacto = Math.sqrt(raizDe);

        System.out.println("La velocidad de impacto es de "+(float)velocidadImpacto+" pies/seg");


    }

}
