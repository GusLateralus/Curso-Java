// Bucles infinitos
package bucleinfinito;

import java.util.Scanner;


public class BucleInfinito {

    
    public static void main(String[] args) {
        // Veamos un ejemplo:
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
