/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaciclofor;

import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class TareaCicloFor {
        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaracion de variables
        int asignaturas, estudiantes, edad;
        double totalPromedio, promedio, bim1, bim2, sumaPromedio=0, promedioEdad=0, promedioNotas=0, sumaEdad=0, sumaNotas=0;
        String cadena="", nombre="", nombreAsignatura="";

        

        // Ciclo for
        System.out.println("Ingrese el número de estudiantes: ");
        estudiantes = entrada.nextInt();
        
        
        for(int i = 1; i <= estudiantes; i ++){
            entrada.nextLine(); // Limpiar Scanner
            sumaPromedio = 0;
            // Numero de asignaturas
            System.out.printf("\n\nIngrese el Nombre del estudiante (%d): ", i);
            nombre = entrada.nextLine();
            nombre = nombre.toUpperCase();
            
            System.out.println("Ingrese la Edad del estudiante: ");
            edad = entrada.nextInt();
            sumaEdad = sumaEdad + edad;
            
            System.out.println("Ingrese el número de asignaturas: ");
            asignaturas = entrada.nextInt();

            cadena = String.format("%s---------------------------------------\n\nNombre de Estudiante %d: %s\nEdad: %d\nNumero de asignaturas: %d"
                    + "\n\nReporte de Notas\nPersona\t\tBim-1\t\tBim-2\t\tPromedio\n", cadena, i,nombre, edad, asignaturas);
        

            // Ciclo for
            for (int contador = 1; contador <= asignaturas; contador ++){
                entrada.nextLine();
                // Ingreso de datos
                System.out.printf("\nIngrese el nombre de la asignatura %d: ", contador);
                nombreAsignatura = entrada.nextLine();
                       
                System.out.printf("\nIngrese la nota de %s en el bimestre 1: ", nombreAsignatura);
                bim1 = entrada.nextDouble();

                System.out.printf("Ingrese la nota de %s en el bimestre 2: ", nombreAsignatura);
                bim2 = entrada.nextDouble();


                // Calculo
                
                promedio = (bim1 + bim2) / 2;
                sumaPromedio = sumaPromedio + promedio;
                
                
                // Actualizamos cadena
                cadena = String.format("%s%-8s\t%.2f\t\t%.2f\t\t%.2f\n", cadena, nombreAsignatura, bim1, bim2, promedio);
            
            }// Fin for

            // Actualizacion cadena
            totalPromedio = sumaPromedio/asignaturas;
            sumaNotas = sumaNotas + totalPromedio;
            cadena = String.format("%s\t\t\t\tPromedio\t%.2f\n", cadena, totalPromedio);


            // Comparacion
            if (totalPromedio >= 19) {
                cadena = String.format("%s\n%s tiene uun promedio de SOBRESALIENTE\n", cadena, nombre);
            } else if (totalPromedio < 19 && totalPromedio >= 19) {
                cadena = String.format("%s\n%s tiene uun promedio de MUY BUENO\n", cadena, nombre);            
            } else if (totalPromedio < 16 && totalPromedio >= 13) {
                cadena = String.format("%s\n%s tiene uun promedio de BUENO\n", cadena, nombre);            
            } else {
                cadena = String.format("%s\n%s tiene uun promedio de REGULAR\n", cadena, nombre);            
            }
            
            
        }// Fin for
        
        // Informacion Global
        promedioEdad = sumaEdad / estudiantes;
        promedioNotas = sumaNotas / estudiantes;
        
        // Salida
        
        
        
        System.out.printf("Reporte calificaciones de estudiantes\n\n%s\n\n\nInformacion global de los estudiantes\nPromedio de edad es: %.2f\nPromedio de Notas de los estudiantes es: %.2f\n", cadena, promedioEdad, promedioNotas);
    }
}
