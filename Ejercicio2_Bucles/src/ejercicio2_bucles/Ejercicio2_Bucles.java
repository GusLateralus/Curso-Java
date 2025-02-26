/*
    Realizar un programa que dado por teclado un límite numérico (por ejemplo 100)
muestre en pantalla todos los números hasta ese límite (empezando por 1)

*/
package ejercicio2_bucles;

import java.util.Scanner;


public class Ejercicio2_Bucles {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;
        
        System.out.println("Digite un número límite de números: ");
        limite = teclado.nextInt();
        
        System.out.println("Lista de números: ");
        
        for(int count=1; count <= limite; count++)
        {
            System.out.println(" "+count);
        }
        
    }
    
}
