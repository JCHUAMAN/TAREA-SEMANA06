package Programa;

/*
vamos a sumar los digitos de un numero
ejemplo:
Numero ingresado=1988
suma= 1 + 9 + 8 + 8 = 26

*/
import java.util.Scanner;
public class Ejercicio2 {
    
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // entrada de datos
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        //proceso de los datos
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;  // Sumar el último dígito
            numero /= 10;  // Eliminar el último dígito
        }
// salida de los datos
        System.out.println("La suma de los dígitos del numero es: "  + suma);
    }
}
