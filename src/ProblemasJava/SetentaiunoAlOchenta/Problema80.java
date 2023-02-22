package ProblemasJava.SetentaiunoAlOchenta;

import java.util.Scanner;

public class Problema80 {

    public static void main(String[] args) {

        //Almacene en una matriz de 3x2, 6 números y obtenga la cantidad de pares e impares.

        //Variables
        int cantidadPares = 0, cantidadImpares = 0, i, j;

        //Arreglos
        int[][] n = new int[3][2];

        //Entrada
        Scanner teclado = new Scanner(System.in);
        System.out.print("Numero (0 , 0) : ");
        n[0][0] = teclado.nextInt();
        System.out.print("Numero (0 , 1) : ");
        n[0][1] = teclado.nextInt();
        System.out.print("Numero (1 , 0) : ");
        n[1][0] = teclado.nextInt();
        System.out.print("Numero (1 , 1) : ");
        n[1][1] = teclado.nextInt();
        System.out.print("Numero (2 , 0) : ");
        n[2][0] = teclado.nextInt();
        System.out.print("Numero (2 , 1) : ");
        n[2][1] = teclado.nextInt();

        //Proceso
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 1; j++) {
                if (n[i][j] % 2 == 0)
                    cantidadPares += 1;
                else cantidadImpares += 1;
            }
        }

        //Salida
        System.out.println();
        System.out.println("Cantidad de pares: " + cantidadPares);
        System.out.println("Cantidad de impares: " + cantidadImpares);

    }
}
