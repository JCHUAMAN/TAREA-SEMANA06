
package Programa;
/*
Vamos a crear un programa que nos muestra los numeros
anteriores al numero ingresado
*/
import java.util.Scanner;
public class Ejercicio3 {
     public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        // declarar variable
        int n,x;
        System.out.print("Ingrese el numero:");
        // entrada de datos
        n=teclado.nextInt();
        x=1;
        while (x<=n) {
            // salida de los datos
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }
    
}
