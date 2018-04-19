/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

public class SeleccionAnidada {

    public static void main(String[] args) {
        // documentacion
        Scanner ent = new Scanner(System.in);
        
        
        double calificacion;
        String nombre;
        
        System.out.println("Ingresar el nombre");
        nombre = ent.nextLine();
        nombre = nombre.toUpperCase();
        System.out.println("Ingresar su calificacion: ");
        calificacion = ent.nextDouble();
        
        if (calificacion >= 50) {
            System.out.printf("ESTUDIANTE %s\n\tAprobado\ncon calificacion: %.2f\n\t", nombre, calificacion);
        } else {
            System.out.printf("ESTUDIANTE %s\n\tReprobado\ncon calificacion: %.2f\n\t", nombre, calificacion);
                
        }
    }
}
