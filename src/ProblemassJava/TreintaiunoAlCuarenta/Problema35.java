package ProblemassJava.TreintaiunoAlCuarenta;

import java.util.Scanner;

public class Problema35 {

    public static void main(String[] args) {

        /*Dado el número del mes y el año (cuatro dígitos) de una fecha, determinar en letras qué mes
        es y cuántos días tiene. Considerar que febrero tiene 28 o 29 días si el año es bisiesto, un año es bisiesto
        si es múltiplo de 4, pero no de 100, y si de 400. */

        //Variables
        int mes, año, dia = 0;
        String mesLetras = "";

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese número de mes: ");
        mes = teclado.nextInt();
        System.out.println("Ingrese año: ");
        año = teclado.nextInt();

        //Proceso
        switch (mes){
            case 1:
                dia = 31;
                mesLetras = "Enero";
                break;
            case 2 :
                if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0))
                dia = 29 ;
                else
                dia = 28 ;
                mesLetras = " Febrero";
                break;
            case 3:
                dia = 30;
                mesLetras = "Abril";
                break;
            case 4:
                dia = 31;
                mesLetras = "Mayo";
                break;
            case 5:

        }


    }
}
