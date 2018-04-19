/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*

    Crear un programa que permita ingresar una calificación por teclado
    Si la calificación ingresada es mayor o igual a 5 y la calificación es menor 
    a 10 se debe presentar un mensaje que diga "Usted está en supletorios"
    De lo contrario se presenta un mensaje con el valor de la calificación 
    dividido para dos.

*/

package ejemplos;

import java.util.Scanner;

/**
 *
 * @author Renato
 */
public class EjemploSeleccion {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion;
        System.out.println("Ingrese su calificacion");
        calificacion = entrada.nextDouble();
        
        // En python se usa "and"
        if(calificacion >= 5 && calificacion < 10){
            System.out.printf("Usted está en supletorios");
            
        }else{
            // System.out.printf("%d/n", calificacion/2);
            double resultado = calificacion/2;
            System.out.printf("%.2f", resultado);
        }
    }
}
