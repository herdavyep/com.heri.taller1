package com.heri.pu25;

import java.io.IOException;

/**
 * Created by heribertodavid on 19/02/17.
 */
public class Punto25 {

    public static void main(String[] args) {

        double deuda = 200;
        int years = 5;
        double interesAnual = 6;

        int meses = years*12;
        double interes = (interesAnual*0.01)/12;
        double cuota = (interes*deuda)/(1-(Math.pow((1/(1+interes)),meses)));

        System.out.println("\n\nPrestamo Miguel");
        System.out.println("Prestamo: "+deuda);
        System.out.println("tiempo: "+years+" años");
        System.out.println("Interes Anual: "+interesAnual+" %");
        System.out.println("Cuotas fijas: "+cuota+"\n");

        System.out.println("|\t\tCuota\t\t|\t\tInteres\t\t|\t\tCapital\t\t|\t\tPrestamo\t\t|");

        for (int i = 0; i <= meses; i++)
        {
            if (i == 0)
            {
                System.out.println("|\t\t\t"+i+"\t\t|\t\t\t"+0+"\t\t|\t\t"+0+"\t\t\t|\t\t"+deuda+"\t\t|");
                i++;
            }

            double interescuota = deuda * interes;
            double amortizacion = cuota - interescuota;
            deuda = deuda - amortizacion;

            System.out.println("|\t\t\t"+i+"\t\t|\t\t"+reDecimal(interescuota,2)+"\t\t|\t\t"+reDecimal(amortizacion,2)+"\t\t|\t\t"+reDecimal(deuda,2)+"\t\t|");

        }
    }

    public static double reDecimal(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }

}
