package com.heri.pu9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 18/02/17.
 */
public class Punto9 {

    public static void main (String[] args ) throws IOException {

        double horas,minutos,segundos,dias;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingrese las horas ");
        horas = Double.parseDouble(br.readLine());

        minutos = horas * 60;
        segundos = minutos * 60;
        dias = horas / 24;

        System.out.println("Las "+horas+" horas equivalen a "+minutos+" minutos");
        System.out.println("Las "+horas+" horas equivalen a "+segundos+" segundos");
        System.out.println("Las "+horas+" horas equivalen a "+(float)dias+" dias");


    }

}
