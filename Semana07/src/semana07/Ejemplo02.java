package semana07;

/**
 * @author Renato
 */
public class Ejemplo02 {
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        for( int contador = 1; contador <= 20; contador += 2){
            System.out.printf("%d ", contador);
            suma = suma + contador;
        }
        System.out.printf("\nLa suma de los pares del 1 al 20 es = %d.", suma); // Imprime nueva linea
        
    }    
}
