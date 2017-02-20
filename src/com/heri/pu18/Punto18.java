package com.heri.pu18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto18 {

    public static void main (String[] args ) throws IOException {

        String nombre;
        double horasTrabajadas,horasExtra,sueldoHora,sueldo;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nombre del empleado");
        nombre = br.readLine();

        System.out.println("Horas trabajadas");
        horasTrabajadas = Double.parseDouble(br.readLine());

        System.out.println("Sueldo por hora");
        sueldoHora = Double.parseDouble(br.readLine());

        if (horasTrabajadas <= 40){

            sueldo = horasTrabajadas * sueldoHora;

        }else{

            horasExtra = horasTrabajadas - 40;
            sueldo = (40 * sueldoHora) + (horasExtra * (sueldoHora * 1.5));

        }

        System.out.println("El sueldo de "+nombre+" Es $"+sueldo+" pesos");
    }

}
