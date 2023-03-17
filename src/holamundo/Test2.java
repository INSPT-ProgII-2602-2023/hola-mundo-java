
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Test2 {

    public static void main(String[] args) {
        int num;
        int fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número natural");
        num = input.nextInt();
        if (num < 0) {
            System.out.println("Te pedi un natural :@");
        } else {
            for (int i = 1; i <= num; i++) {
                fact = i * fact;
            }        
            System.out.println("El factorial de " + num + " es " + fact);
        }
        

    }

}
