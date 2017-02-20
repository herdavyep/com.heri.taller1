package com.heri.pu22;

import java.io.IOException;

/**
 * Created by heribertoadavid on 19/02/17.
 */
public class Punto22 {

    public static void main (String[] args ) throws IOException {

            double rebotePelota = 10,reboteAnterior,auxiliar = 0,acomularRebotes = 10;

            reboteAnterior = rebotePelota;

            for (int i = 0; i <= 39; i++){

                auxiliar = reboteAnterior * .66;

                acomularRebotes = acomularRebotes + auxiliar;

                reboteAnterior = auxiliar ;

            }

        System.out.printf(""+acomularRebotes);

    }

}
