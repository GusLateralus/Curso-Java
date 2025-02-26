/*
Ejercicio 3: Realizar un programa que muestre por pantalla los números del 200 al 250
saltando de 2 en 2. La secuencia debería ser: 200, 202, 204, ..., 250

*/
package ejercicio3_bucles;


public class Ejercicio3_Bucles {

    
    public static void main(String[] args) {
        System.out.println("Secuencia de números de 200 a 250");
        
        for(int i = 200; i<=250; i +=2)
        {
            System.out.print(" "+i);
        }
        
    }
    
}
