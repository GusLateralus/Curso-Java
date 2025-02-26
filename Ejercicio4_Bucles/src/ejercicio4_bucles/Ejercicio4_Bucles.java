/*
Ejercicio 4: Realizar un programa que lleve a cabo la cuenta regresiva para el
año nuevo. La cuenta debe comenzar en 10 y terminar en 1.

*/
package ejercicio4_bucles;


public class Ejercicio4_Bucles {

    
    public static void main(String[] args) {
        System.out.println("Cuenta regresiva para año nuevo:");
        
        for(int count=10; count>=1; count--)
        {
            System.out.println(" "+count);
        }
        
        System.out.println("¡Feliz año!");
    }
    
}
