/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class Taller01_Ejercicio02 {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaracion de variables
        int hijos, padres;
        double ganancia=0.1, pasajes=0, bar=0, salidas=0, totalPasajes=0, totalBar=0, totalSalidas=0, total;
        String cadena="", nombrePadre;

        

        // Ciclo for
        System.out.println("Ingrese el número de padres: ");
        padres = entrada.nextInt();
        
        
        for(int i = 1; i <= padres; i ++){
            entrada.nextLine(); // Limpiar Scanner
            // Numero de hijos
            System.out.printf("\n\nIngrese el Nombre del padre (%d): ", i);
            nombrePadre = entrada.nextLine();
            nombrePadre = nombrePadre.toUpperCase();
            
            System.out.println("Ingrese cuanto gana semanalmente: ");
            ganancia = entrada.nextInt();

            System.out.println("Ingrese el número de hijos: ");
            hijos = entrada.nextInt();

            cadena = String.format("%s---------------------------------------\nReporte Gastos de Padre de Familia\n\nNombre de Padre de Familia: %s\nSueldo semanal: $ %.2f\nNumero de hijos: %d"
                    + "\n\nReporte de Gastos\nPersona\t\tPasajes\t\tBar\t\tSalidas\n", cadena, nombrePadre, ganancia, hijos);
        

            // Ciclo for
            for (int contador = 1; contador <= hijos; contador ++){

                // Ingreso de datos
                System.out.printf("\nIngrese lo que gasta Hijo%d en PASAJES: ", contador);
                pasajes = entrada.nextDouble();

                System.out.printf("Ingrese lo que gasta Hijo%d en BAR: ", contador);
                bar = entrada.nextDouble();

                System.out.printf("Ingrese lo que gasta Hijo%d en SALIDAS: ", contador);
                salidas = entrada.nextDouble();

                // Calculo
                totalPasajes = totalPasajes + pasajes;
                totalBar = totalBar + bar;
                totalSalidas = totalSalidas + salidas;

                // Actualizamos cadena
                cadena = String.format("%s%s%d\t\t%.2f\t\t%.2f\t\t%.2f\n", cadena, "Hijo", contador, pasajes, bar, salidas);
            }
            // Fin for

            // Actualizacion cadena
            cadena = String.format("%sTOTAL\t\t%.2f\t\t%.2f\t\t%.2f", cadena, totalPasajes, totalBar, totalSalidas);

            total = totalPasajes + totalBar + totalSalidas;

            // Comparacion
            if(total > ganancia){
                cadena = String.format("\n%s\n\nEl padre de familia %s le falta dinero\n---------------------------------------\n", cadena, nombrePadre);
            }else if(total < ganancia){
                cadena = String.format("\n%s\n\nEl padre de familia %s le sobra dinero\n---------------------------------------\n", cadena, nombrePadre);
            }else{
                cadena = String.format("\n%s\n\nEl padre de familia %s le alcanza dinero\n---------------------------------------\n", cadena, nombrePadre);
            }
            
        }// Fin for
        
        // Salida
        System.out.printf("%s", cadena);
    }
}
