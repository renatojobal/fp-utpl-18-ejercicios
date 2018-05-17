
package taller1;
import java.util.Scanner;
/**
 * @author Renato
 */
public class Taller1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaracion de variables
        int hijos;
        double ganancia=0.1, pasajes=0, bar=0, salidas=0, totalPasajes=0, totalBar=0, totalSalidas=0, total;
        String cadena="";

        
        // Numero de hijos
        System.out.println("Ingrese cuanto gana semanalmente: ");
        ganancia = entrada.nextInt();
        
        System.out.println("Ingrese el número de hijos: ");
        hijos = entrada.nextInt();
        
        cadena = String.format("\t\t\t\tPadre Familia gana semanalmente: %.2f\n\nGastos Familia\nPersona\tPasajes\tBar\tSalidas\n", ganancia);
        
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
            cadena = String.format("%s%s%d\t%.2f\t%.2f\t%.2f\n", cadena, "Hijo", contador, pasajes, bar, salidas);
        }
        
        
        // Actualizacion cadena
        cadena = String.format("%sTOTAL\t%.2f\t%.2f\t%.2f", cadena, totalPasajes, totalBar, totalSalidas);
        
        total = totalPasajes + totalBar + totalSalidas;
        
        // Salida
        if(total > ganancia){
            System.out.printf("\n%s\n\n%s\n", cadena, "El padre de familia le falta dinero");
        }else if(total < ganancia){
            System.out.printf("\n%s\n\n%s\n", cadena, "El padre de familia le sobra dinero");
        }else{
            System.out.printf("\n%s\n\n%s\n", cadena, "El padre de familia le ajusta dinero");
        }
       
    }
    
}
