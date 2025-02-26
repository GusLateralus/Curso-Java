/*
Ejercicio 1: Operadores Aritméticos
Escribe un programa que calcule el área de un rectángulo. Pide al usuario que ingrese el valor de la base y la altura, y luego calcula el área utilizando la fórmula:

Area=base×altura

Imprime el resultado en pantalla.

*/
package ejercicio1_basealtura;

import java.util.Scanner;


public class Ejercicio1_BaseAltura {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double b,h,area;
        
        System.out.println("B I E N V E N I D O\n");
        System.out.println("Digite la base del rectangulo: ");
        b = teclado.nextDouble();
        System.out.println("Digite la altura del rectangulo: ");
        h = teclado.nextDouble();
        
        area = b*h;
        
        System.out.println("El área del rectángulo es: "+area);
    }
    
}
