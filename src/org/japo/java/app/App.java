/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.app;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public final class App {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

//Datos
    int N1;
    int N2;

//constantes de operación
    public static final int OP_SUM = 0; // Suma
    public static final int OP_RES = 1; // Resta
    public static final int OP_MUL = 2; // Producto
    public static final int OP_DIV = 3; // Cociente
    public static final int OP_MOD = 4; // Resto
    public static final int OP_MED = 5; // Media
    public static final int OP_MAY = 6; // Mayor
    public static final int OP_MEN = 7; // Menor

    public final void launchApp() {

        //entrada
        System.out.print("Ingrese el numero 1 ...");
        N1 = SCN.nextInt();

        System.out.print("Ingrese el numero 2 ...");
        N1 = SCN.nextInt();
        //signatura    
        System.out.printf("Entre %d y %d el mayor es %d%n", N1, N2,
                /*llamada a metodo operar(mas abajo)*/ (int) operar(N1, N2, OP_MAY));

        System.out.printf("Entre %d y %d el menor es %d%n", N1, N2,
                (int) operar(N1, N2, OP_MEN));

        System.out.printf("La suma de %d y %d es %d%n", N1, N2,
                (int) operar(N1, N2, OP_SUM));

        System.out.printf("La resta de %d menos %d es %d%n", N1, N2,
                (int) operar(N1, N2, OP_RES));

        System.out.printf("La multiplicacion de %d y %d es %d%n", N1, N2,
                (int) operar(N1, N2, OP_MUL));

        System.out.printf("La division de %d entre %d es %d%n", N1, N2,
                (int) operar(N1, N2, OP_DIV));

        System.out.printf("el resto de la division %d entre %d es %d%n", N1, N2,
                (int) operar(N1, N2, OP_MOD));

        System.out.printf("La media entre %d y %d es %d%n", N1, N2,
                (int) operar(N1, N2, OP_MED));

        //definiremos el Metodo
        //para que los malos no lo puedan modificar pondremos final
        //antes del metodo "operar" .."double" perque el resultat sera double 
        //definit per les variants.
        //metodo => argumentos y parametros va entre los parentesis del metodo.
        //argumentos se separan por coma
        //argumento son los datos que se envian
        //los datos que reciben los argumentos son los parametros
    }
//definicion

    public static final double operar(double n1, double n2, int op) {
        double result = 0;

        switch (op) {
            case OP_MAY:
                result = n1 > n2 ? n1 : n2;
                break;
            case OP_MEN:
                result = n1 < n2 ? n1 : n2;
                break;
            case OP_SUM:
                result = n1 + n2;
                break;
            case OP_RES:
                result = n1 - n2;
                break;
            case OP_MUL:
                result = n1 * n2;
                break;
            case OP_DIV:
                result = n1 / n2;
                break;
            case OP_MOD:
                result = n1 % n2;
                break;
            case OP_MED:
                result = (n1 + n2) / 2;
                break;
        }

        return result;
    }
}
