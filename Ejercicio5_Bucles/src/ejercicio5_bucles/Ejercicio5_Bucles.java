/*
    Realizar un programa que muestre en pantalla palabras que sean ingresadas por teclado
hasta que ingrese la palabra "salir"


*/
package ejercicio5_bucles;

import java.util.Scanner;


public class Ejercicio5_Bucles {

    /*
        Diferencias entre métodos next() y nextLine()
    
        next() acepta una cadena de caracteres y la devuelve, hasta encontrar espacios en blanco o saltos
        de línea. Captura palabras
    
        nextLine() acepta toda la cadena de caracteres sin importar si hay espacios en blanco. Captura cadenas completas
    
    */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String palabra; // No se considera buena práctica inicializar una varia
        //ble si es para evitar un error, pero sí lo es cuando es necesario para el flujo lógico
        
        do{
            System.out.println("Digite palabras al azar. Escriba 'salir' para terminar la ejecución. ");
            palabra = teclado.next();
        }while(!palabra.equalsIgnoreCase("salir"));
        
        /*while(!palabra.equalsIgnoreCase("salir"))
        {
            System.out.println("Digite palabras al azar. Escriba 'salir' para terminar la ejecución. ");
            palabra = teclado.next();
        }*/
        
        System.out.println("Programa terminado");
    }
    
}
