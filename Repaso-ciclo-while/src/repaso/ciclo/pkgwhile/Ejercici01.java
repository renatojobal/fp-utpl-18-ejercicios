
package repaso.ciclo.pkgwhile;
import java.util.Scanner;
/**
 * Ejercicio 1
 * 
 * 
 * @author Renato
 */
public class Ejercici01 {
    public static void main(String[] args) {
        
        // Declaración de varibales        
        String cadenaEncabezado = "", cadenaArticulos = "", articulo = "";
        String nombre = "";
        Double subtotal, iva,total, precioUnit, precioTotal, cantidad;
        subtotal = 0.0;
        int continuar;

        cadenaEncabezado = "\t\tFactura\n\nSupermercado: 'Todo a menor precio'\nNombre del Cliente: ";
        cadenaArticulos = "Articulo\t\tCantidad\t\tPrecio Unitario\t\tPrecio Total\n";
        
        Scanner entrada = new Scanner(System.in); // Creamos un scanner llamado 'entrada'
        
        // Ingreso de datos del cliente
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = entrada.nextLine();
        
        // Concatenamos el nombre a cadenaEncabezado
        cadenaEncabezado = String.format("%s%s\n", cadenaEncabezado, nombre);
        
        // Ingreso de datos de los artículos
        continuar = 1;
        while (continuar == 1) {
            // Delcaramos variables 
            entrada.nextLine();
            System.out.println("Ingrese el nombre del articulo: ");
            articulo = entrada.nextLine();
            System.out.println("Ingrese la cantidad: ");
            cantidad = entrada.nextDouble();
            System.out.println("Ingrese el precio unitario del articulo: ");
            precioUnit = entrada.nextDouble();
            entrada.nextLine();
            
            precioTotal = cantidad*precioUnit;
            subtotal = subtotal + precioTotal;
            
            // Concatenación de cadena
            cadenaArticulos = String.format("%s%-8s\t\t%02.0f\t\t\t%.2f\t\t\t%.2f\n", cadenaArticulos, articulo, cantidad, precioUnit, precioTotal);
            
            // Continuar o no el cilo
            System.out.println("\nDesea ingresar otro artículo?: \n 1 = 'Si'  2 = 'No, salir'");
            continuar = entrada.nextInt();
            
        }
        
        // Calculo del subottaol, iva y total
        
        iva = subtotal * 0.14;
        total = subtotal - iva;
        // Concatenación de cadena
        cadenaArticulos = String.format("%s\t\t\t\t\t\t%s\t\t%.2f\n\t\t\t\t\t\t%s\t\t\t%.2f\n\t\t\t\t\t\t%s\t\t\t%.2f\n", cadenaArticulos, "Subtotal", subtotal, "Iva 14%", iva, "Total", total);
        
        // Salida de datos
       
        System.out.println(cadenaEncabezado);
        System.out.println(cadenaArticulos);
        
    }
}
