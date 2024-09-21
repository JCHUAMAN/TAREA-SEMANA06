
package Programa;
/* 
Vamos a generar la tabla de multiplicacion segun el numero ingresado.
*/
import java.util.Scanner;
public class Ejercicio1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           // entrada de datos
        System.out.print("Introduce un número: ");
             int numero = scanner.nextInt();
             //proceso de datos
              int i = 1;
        while (i <= 12) {
           // salida de datos
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }
}
    

