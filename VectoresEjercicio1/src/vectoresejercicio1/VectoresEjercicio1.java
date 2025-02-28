/*
Realizar un programa que permita la carga de 10 números en un vector.
Una vez cargados, se necesita que el programa determine cuál es el mayor y cuál
es el menor de ellos
*/
package vectoresejercicio1;

import java.util.Scanner;


public class VectoresEjercicio1 {

    
    public static void main(String[] args) {
        int numeros[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        int max= Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        
        for(int i=0; i<numeros.length;i++)
        {
            System.out.println("Digite un numero para la posicion "+i+":");
            numeros[i]= teclado.nextInt();
        }
        
        //Búsqueda del mayor:
        for(int i= 0; i<numeros.length;i++)
        {
            if(numeros[i]>max)
            {
                max = numeros[i];
            }
            
        }
        System.out.println("El mayor es: "+max);
        
        
        //Búsqueda del menor:
        for(int i=0; i<numeros.length;i++)
        {
            if(numeros[i]<min)
            {
                min = numeros[i];
            }
        
        }
        System.out.println("El menor es: "+min);
        
        
        
    }
    
}
