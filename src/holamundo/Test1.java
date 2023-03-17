
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char x = '@';
        int unEntero = 10;
        double pi = 3.14;
        boolean llueve = false;
        String nombre = "Alan";
        String apellido = "Turing";
        Scanner input = new Scanner(System.in);


        
        System.out.println("¿Cómo te llamás?");
        nombre = input.nextLine();
        System.out.println("Hola " + nombre);
        
        
        
        
    }

}
