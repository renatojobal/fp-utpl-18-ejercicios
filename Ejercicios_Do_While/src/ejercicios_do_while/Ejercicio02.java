package ejercicios_do_while;
import java.util.Scanner;

/**
 * @author Renato
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Declaración de variables
        String nombre, cadena="", nivel="";
        double pases=0, goles=0, sumaPases=0, sumaGoles=0, sumaTotalPases=0, sumaTotalGoles=0, promedioPases=0, promedioGoles=0;
        int continuar=1, partidos, i=1, numJugadores=0;
        
        cadena = "Reporte de Jugadores del Equipo 'UTPL'\n\n\n"
                + "Nombre del Jugador\t\tTotal de Pases\tTotal Goles\tNivel delJugador\n";
        
        System.out.println("Antes de empezar, ingrese el numero de partidos evaluados: ");
        partidos = entrada.nextInt();

        // Ciclo Do-While
        do{
            // Contador de jugadores
            numJugadores = numJugadores + 1;
            
            // Limpiar el escaner
            entrada.nextLine();
                    
            // Reinicio de variables
            sumaPases = 0;sumaGoles = 0;pases = 0; goles = 0;
            
            // Ingreso de nombre
            System.out.println("Ingrese el nombre del jugador: ");
            nombre = entrada.nextLine();
            nombre = nombre.toUpperCase();
            cadena = String.format("%s\n%-1s", cadena, nombre);
            
            // Ciclo For
            for(i = 1; i <= partidos; i ++){
                // Ingreso de datos             
                System.out.printf("Ingrese el número de PASES dados por el jugador %s en el partido %d: ", nombre, i);
                pases = entrada.nextDouble();
            
                System.out.printf("Ingrese el número de GOLES dados por el jugador %s en el partido %d: ", nombre, i);
                goles = entrada.nextDouble();
            
                sumaPases = sumaPases + pases;
                sumaGoles = sumaGoles + goles;
                // Concatenación de cadena (Si es la primera linea, la que tiene el nombre, le pone un tabulador menos)
                if (i == 1){
                    cadena = String.format("%s\t\t\tP%d: %.0f\t\tP%d: %.0f\n", cadena, i, pases, i, goles);
                }else{
                    cadena = String.format("%s\t\t\t\tP%d: %.0f\t\tP%d: %.0f\n", cadena, i, pases, i, goles);
                } 
                
            }
            // Fin For
                     
            // Nivel de jugador
            if (sumaPases >= 100){
                nivel = "Excelente";
            }else if(sumaPases >= 80 && pases <= 79){
                nivel = "Muy Bueno";
            } else if(sumaPases >= 60 && pases <= 79){
                nivel = "Bueno";
            }else{
                nivel = "Regular";
            }
            // 
            sumaTotalPases = sumaTotalPases + sumaPases; 
            sumaTotalGoles = sumaTotalGoles + sumaGoles;
            
            // Concatenacion cadena
             cadena = String.format("%s\n\t\t\t\tTotal: %.0f\tTotal: %.0f\t%s\n\n", cadena, sumaPases, sumaGoles, nivel);
            
            // Continuar o no
            System.out.println("Desea ingresar otro jugaro: 1 = 'Si' 2 = 'No'");
            continuar = entrada.nextInt();
        }while(continuar == 1);
        // Fin Do-While
    
    // Promedios
    promedioPases = sumaTotalPases / numJugadores;
    promedioGoles = sumaTotalGoles / numJugadores;
    
    // Concatenación de cadena
    cadena = String.format("%s\nDatos Finales:\n%d Jugadores Analizados.\n"
            + "Promedio de Pases del equipo es %.0f\nPromedio de Goles del equipo es %.0f", cadena, numJugadores, promedioPases, promedioGoles);
    
    
    // Salida
    System.out.println(cadena);
    }
}
