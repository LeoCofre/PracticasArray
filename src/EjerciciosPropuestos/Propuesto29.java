package EjerciciosPropuestos;

import java.util.Scanner;

public class Propuesto29 {

    public static void main(String[] args) {

        /*Según la siguiente tabla, obtener la ciudad que visitará, después de ingresar su sexo y el
        puntaje obtenido en un examen.

                                    _________Sexo___________
            Puntaje                 Masculino       Femenino
       Entre 18 y 35                Arequipa        Cuzco
       Entre 36 y 75                Cuzco           Iquitos
       Mayor a 75                   Iquitos         Arequipa

        */

        //Variables
        int puntaje, sexo;
        String cuidad = "";

        //Entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese sexo:");
        System.out.println("1.- Masculino");
        System.out.println("2.- Femenino");
    }

}
