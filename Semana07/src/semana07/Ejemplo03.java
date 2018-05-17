package semana07;
/**
 * @author Renato
 */
public class Ejemplo03 {
    public static void main(String[] args) {
        // TODO code application logic here
        int suma = 0;
        for( int contador = 1; contador <= 20; contador ++){
            System.out.printf("%d ", contador);
            if (contador % 2 == 0 ){    
                suma = suma + contador;
            }
        }
        System.out.printf("\nLa suma de los pares del 1 al 20 es = %d.", suma); // Imprime nueva linea
    }
}
