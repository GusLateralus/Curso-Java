/*
Realizar un programa que permita la carga de 15 números en un vector.
Una vez cargados, se necesita que el programa cuente e informe por pantalla 
cuántas veces se cargó el número 3.
*/
package vectoresejercicio2;

import java.util.Scanner;


public class VectoresEjercicio2 {

    
    public static void main(String[] args) {
        int numeros[] = new int[15];
        int count=0;
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0;i<15;i++)
        {
            System.out.println("Digite un numero para la posicion "+i);
            numeros[i] = teclado.nextInt();
            
            if(numeros[i] == 3)
            {
                count++;
            }
        
        }
        
        System.out.println("El numero 3 fue ingresado "+count+" veces");
        
    }
    
}
