// Bucle While
package buclewhile;

import java.util.Scanner;


public class BucleWhile {

    
    public static void main(String[] args) {
        /*int count = 0;
        
        System.out.println("Aquí va el bucle: ");
        while(count <10)
        {
            
            System.out.println("Estamos en la vuelta "+count);
            count++;
        }*/
        
        // Ejemplo de While con centinela (bandera)
        
        Scanner teclado = new Scanner(System.in);
        boolean bandera = true;
        String ans;
        
        while(bandera == true)
        {
            System.out.println("El valor de mi bandera es: "+bandera);
            System.out.println("¿Estás actualmente suscrito? "+bandera);
            
            System.out.println("¿Deseas desuscribirte del canal? [Y/N]");
            ans = teclado.next(); // Este método se aplica únicamente para strings
            
            if(ans.equalsIgnoreCase("Y"))
            {
                bandera = false;
            }
    
        
        }
            
    
}
}
