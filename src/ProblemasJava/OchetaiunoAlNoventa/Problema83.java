package ProblemasJava.OchetaiunoAlNoventa;

import java.util.Scanner;

public class Problema83 {

    public static void main(String[] args) {

        //Ingrese 6 números en una matriz de 3x2 y obtenga el numero mayor ingresado.

        //Variables
        int m, i, j;

        //Arreglos
        int[][] n = new int[3][2];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print(" Numero (0 , 0) : ");
        n[0][0] = teclado.nextInt();
        System.out.print(" Numero (0 , 1) : ");
        n[0][1] = teclado.nextInt();
        System.out.print(" Numero ( 1 , O) : ");
        n[1][0] = teclado.nextInt();
        System.out.print(" Numero (1 , 1 ) : ");
        n[1][1] = teclado.nextInt();
        System.out.print(" Numero (2 , 0) : ");
        n[2][0] = teclado.nextInt();
        System.out.print(" Numero (2 , 1) : ");
        n[2][1] = teclado.nextInt();
    }
}
