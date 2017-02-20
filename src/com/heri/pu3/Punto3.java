package com.heri.pu3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by heribertodavid on 17/02/17.
 */
public class Punto3 {

    public static void main (String[] args ) throws IOException {

        double a,b,c,s,areaTriangulo,raizDe;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ingresa el lado a");
        a = Double.parseDouble(br.readLine());

        System.out.println("Ingresa el lado b");
        b = Double.parseDouble(br.readLine());

        System.out.println("Ingresa el lado c");
        c = Double.parseDouble(br.readLine());

        s = (a + b + c) / 2;

        raizDe = s*(s-a)*(s-b)*(s-c);

        areaTriangulo = Math.sqrt(raizDe);

        System.out.println("El area del triangulo es = "+areaTriangulo);

    }

}
