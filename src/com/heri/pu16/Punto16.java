package com.heri.pu16;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto16 {

    public static void main (String[] args ) throws IOException {

        double pago,deuda,credito,nuevaDeuda,valorAbsolutoDeuda;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese el valor de la deuda");
        deuda = Double.parseDouble(br.readLine());

        System.out.println("Ingrese el valor del pago");
        pago = Double.parseDouble(br.readLine());

        deuda = - deuda;

        if (pago +  deuda >  0){

            credito = pago + deuda;
            System.out.printf("El cliente tiene un credito a favor de "+credito+" pesos");

        }else if (pago + deuda == 0){

            credito = pago + deuda;
            System.out.printf("El cliente a pagado todas sus facturas");

        }else {

            credito = pago + deuda;
            valorAbsolutoDeuda =  Math.abs(credito);
            nuevaDeuda = valorAbsolutoDeuda + (valorAbsolutoDeuda * 0.3) ;
            System.out.printf("El cliente tiene una nueva deuda de "+nuevaDeuda+" pesos");
        }

    }

}
