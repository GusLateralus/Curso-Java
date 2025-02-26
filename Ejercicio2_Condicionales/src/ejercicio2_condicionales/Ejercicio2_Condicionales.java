/*
Ejercicio 3: Operadores de Comparación
Crea un programa que reciba tres números enteros y determine cuál es el mayor. 
Utiliza operadores de comparación (como >, <, ==) y condicionales (if, else).
*/
package ejercicio2_condicionales;

import java.util.Scanner;

public class Ejercicio2_Condicionales {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.println("B I E N V E N I D O\n");
        System.out.println("Vamos a comparar 3 números para ver cuál es el mayor");
        System.out.println("Digite el primero: ");
        n1 = teclado.nextInt();
        System.out.println("Digite el segundo");
        n2 = teclado.nextInt();
        System.out.println("Digite el tercero");
        n3 = teclado.nextInt();
        
        if(n1 == n2 && n2 == n3)
        {
            System.out.println("Los tres números son iguales");
        }
        
        else{
        
            if(n1>n2 && n1 > n3)
            {
                System.out.println("El número más grande es "+n1);
            }

            if(n2>n1 && n2 > n3)
            {
                System.out.println("El número más grande es "+n2);
            }

            if(n3 > n1 && n3 > n2)
            {
                System.out.println("El número más grande es "+n3);
            }
        }
    }
    
}
