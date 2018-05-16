
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
        String cadenaEncabezado = "", cadenaArticulos = "";
        String nombre = "";
        Double subtotal, iva,total,suma=null;
        int continuar;
        cadenaEncabezado = "\t\tFactura\n\nSupermercado: 'Todo a menor precio'\nNombre del Cliente: ";
        cadenaArticulos = "Articulo\t\tCantidad\t\tPrecio Unitario\t\tPrecio Total\n";
        
        Scanner entrada = new Scanner(System.in); // Creamos un scanner llamado 'entrada'
        
        // Ingreso de datos del cliente
        System.out.println("Ingrese el nombre del cliente: ");
        nombre = entrada.nextLine();
        
        // Concatenamos el nombre a cadenaEncabezado
        //cadenaEncabezado = ("%s%s", cadenaEncabezado, nombre);
        
        
        // Ingreso de datos de los artículos
        continuar = 1;
        while (continuar == 1) {
            // Delcaramos variables 
            String articulo = "";
            Double precioUnit, precioTotal;
            
            int cantidad;
            
            System.out.println("Ingrese el nombre del articulo: ");
            articulo = entrada.nextLine();
            System.out.println("Ingrese la cantidad: ");
            cantidad = entrada.nextInt();
            System.out.println("Ingrese el precio unitario del articulo: ");
            precioUnit = entrada.nextDouble();
            
            
            precioTotal = cantidad*precioUnit;
            suma = suma + precioTotal;
            
            // Concatenación de cadena
            //cadenaArticulos = ("%s%s\t\t%d\t\t%f\t\t%.2f\n", cadenaEncabezado, articulo, cantidad, precioUnit, precioTotal);
            
            // Continuar o no el cilo
            System.out.println("\nDesea ingresar otro artículo?: \n 1 = 'Si'  2 = 'No, salir'");
            continuar = entrada.nextInt();
            
        }
        
        // Calculo del subottaol, iva y total
        subtotal = suma;
        iva = subtotal * 0.14;
        total = subtotal - iva;
        // Concatenación de cadena
        cadenaArticulos = ("%s\t\t\t\t%.2f\t\t%.2f\n%.2f\t\t%.2f\n%.2f\t\t%.2f\n", cadenaEncabezado, subtotal, iva, total);
        
        // Salida de datos
       
        System.out.println(cadenaEncabezado);
        System.out.println(cadenaArticulos);
        
    }
}
