
package matricesejemplo;

import java.util.Scanner;


public class MatricesEjemplo {

    
    public static void main(String[] args) {
        // Definimos una matriz:
        int matriz [][] = new int[3][3]; // Los corchetes también pueden ir antes, o declararla como var.
        Scanner teclado = new Scanner(System.in);
        // Llenamos los valores de la matriz (3x3):
        
        for(int i=0; i<3; i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("Digite un número para la matriz en la posicion "+(i+1)+","+(j+1)+": ");
                matriz[i][j] = teclado.nextInt();
            
            }
        
        }
        
        System.out.println("Los valores digitados fueron: \n"); 
       // Accedemos a los valores:
        for(int i=0; i<3;i++)
        {
            for(int j=0; j<3;j++)
            {
            
                System.out.print(matriz[i][j]+ " ");
            
            
            }
            System.out.println();
        
        }
    }
    
}
