package ejerciciointegradorbucles;

import java.util.Scanner;


public class EjercicioIntegradorBucles {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String patente;
        int tipoEstacionamiento;
        
        System.out.println("B I E N V E N I D O");
        
        while(true)
        {
            System.out.println("\nIngrese el número de patente de su vehículo o escriba 'FIN' para terminar el programa: ");
            patente = teclado.next();
            
            if(patente.equalsIgnoreCase("FIN"))
            {
                System.out.println("Gracias por su preferencia, ¡Hasta luego!");
                break; //Si la palabra ingresada es "fin", entonces el bucle se rompe y mandamos un mensaje de despedida
            }
            
            else{
                System.out.println("1. Por hora ($3 USD)");
                System.out.println("2. Media jornada($15 USD - 5% de descuento");
                System.out.println("3. Jornada completa $30 USD - 10% de descuento");
                System.out.println("Digite una de las opciones: ");
                
                tipoEstacionamiento = teclado.nextInt();
                
                // Continuar ejercicio...
                
            
            }
            
        
        }
        
        
    }
    
}
