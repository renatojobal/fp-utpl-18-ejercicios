/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num;
        String nombreEst;
        int edad = 0;
        int asig;
        String nomAsig;
        double nota1;
        double nota2;
        double suma = 0;
        double suma1 = 0;
        double prom = 0;
        double sumaE = 0;
        double promE = 0;
        double sumaf = 0;
        double promf = 0;
        String cadena_final;
        cadena_final = "";
        
        System.out.println("Ingrese el número de Estudiantes");
        num = entrada.nextInt();
        
        for(int j = 1; j <= num; j++){
            
            entrada.nextLine();
            
            System.out.println("Ingrese los apellidos y nombres del Estudiante(En Mayúsculas)");
            nombreEst = entrada.nextLine();   
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            System.out.println("Ingrese el número de asignaturas");
            asig = entrada.nextInt();
            cadena_final = String.format("%s\n\nReporte calificaciones de estudiantes\n\nNombre del estudiante 1: %s\nEdad:%d\nNúmero de Asignaturas:%d\n\n%s\t\t%s\t\t%s\t\t%s\n", cadena_final, nombreEst, edad, asig,"Asignatura", "Bim-1", "Bim-2", "Promedio");
            
            for (int contador = 1; contador <= asig; contador++) {
                promf = 0;
                entrada.nextLine(); //Limpiar Scanér.
                
                System.out.println("Ingrese el nombre de la asignatura");
                nomAsig = entrada.nextLine();
                System.out.println("Ingrese la nota del Primer Bimestre");
                nota1 = entrada.nextDouble();
                System.out.println("Ingrese la nota del Segundo Bimestre");
                nota2 = entrada.nextDouble();

                suma = suma + nota1;
                suma1 = suma1 + nota2;
                prom = (nota1 + nota2)/2;
                sumaf = sumaf + prom;
                promf = (sumaf)/asig;
                
                cadena_final = String.format("%s%-10s\t\t%.2f\t\t%.2f\t\t%.2f\t\t\n", cadena_final, nomAsig, nota1, nota2, prom);
            }
            cadena_final = String.format("%s%s\t\t%.2f\t\t\n", cadena_final, "\t\t\t\tPromedio", promf);

            System.out.println(); //Imprime una nueva linea
            if (promf >= 19) {
                cadena_final = String.format("%s%stiene el promedio Excelente\n", cadena_final, nombreEst);
            } if (promf >=16 && prom <19){
                cadena_final = String.format("%s%sntiene el promedio Muy Bueno\n", cadena_final, nombreEst);
            }
            if(promf >= 13 && prom<16){
                cadena_final = String.format("%s%stiene el promedio Bueno\n", cadena_final, nombreEst);
            }
            if(promf < 13){
                cadena_final = String.format("%s%s tiene el promedio Regular\n", cadena_final, nombreEst);
            } 
            
        }
        sumaE = sumaE + edad;
        promE = sumaE/num;
    System.out.println(cadena_final);
    System.out.println("\nINFORMACION GLOBAL DE LOS ESTUDIANTES: ");
    System.out.printf("%s%.2f","Promedio de Edad es: \n", promE);
    System.out.printf("Promedio de Notas de los Estudiantes: %.2f\n", promf);
    }
    
}
