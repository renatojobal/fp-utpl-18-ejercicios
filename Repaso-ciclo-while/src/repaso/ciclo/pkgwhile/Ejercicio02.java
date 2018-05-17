
package repaso.ciclo.pkgwhile;
import java.util.Scanner;

/**
 * Ejercicio 2
 * @author Renato
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        
        // Declaración de varibales        
        int contador = 1, limite, contArgentina=0, contChile=0, contColombia=0, contResto=0;
        Double sumImpuestos=0.0, sumPrecioVenta=0.0, costo=0.0, impuesto=0.0, precioVenta=0.0; 
        String cadena01, cadena02, marca, origen;
        
        cadena01 = "\tReporte de Autos Importados\n\nMarca\t\t\t\tOrigen\t\t\tCosto\t\t\tImpuesto\tPrecio Venta\n";
        cadena02 = "";
        
        // Ingreso de datos
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número de autos a ingresar: ");
        limite = entrada.nextInt();
        while (contador <= limite) {
            System.out.printf("\n**********Vehiculo No. %d**********\n", contador);
            // MARCA
            entrada.nextLine();
            System.out.println("Ingrese la MARCA del vehiculo: ");
            marca = entrada.nextLine();
            
            // ORIGEN
            System.out.println("Ingrese el ORIGEN del vehiculo: ");
            origen = entrada.nextLine();
             
            // COSTO
            System.out.println("Ingrese el COSTO del vehiculo: ");
            costo = entrada.nextDouble();
            
            // IMPUESTO
            switch (origen) {
                case "Argentina":
                    impuesto = costo*0.20;
                    contArgentina = contArgentina + 1;
                    break;
                case "Colombia":
                    impuesto = costo*0.25;
                    contColombia = contColombia + 1;
                    break;
                case "Chile":
                    impuesto = costo*0.30;
                    contChile = contChile + 1;
                    break;
                default:
                    impuesto = costo*0.40;
                    contResto = contResto + 1;
                    break;
            }
            
            sumImpuestos = sumImpuestos + impuesto;
            
            // PRECIO VENTA
            precioVenta = costo + impuesto;
            
            // Concatenación de cadena01
            cadena01 = String.format("%s%-8s\t\t\t%-8s\t\t%.2f\t\t%.0f\t\t%.0f\n", cadena01, marca, origen, costo, impuesto, precioVenta);
            
            
            // Concatenacion cadena02
            cadena02 = String.format("\nTotal Autos\t%d\tTot.Imps %.0f\tTot. PV\t%.0f\n\nArgentina\t\t%d\nChile\t\t\t%d\nColombia\t\t%d\nResto de paises\t\t%d",
                    contador, sumImpuestos, sumPrecioVenta, contArgentina, contChile, contColombia, contResto);
            
            // Suma de contador
            contador = contador + 1;
        }
        
        
        // Salida de datos
        System.out.println(cadena01);
        System.out.println(cadena02);
        
    }
}
