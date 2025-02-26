package condicionalesmultiples;

import java.util.Scanner;


public class CondicionalesMultiples {

    public static void main(String[] args) {
        int edad;
        Scanner teclado = new Scanner(System.in);
              
        System.out.println("Ingrese la edad:");
        edad = teclado.nextInt();
        
        if(edad >18)
        {
            System.out.println("Eres mayor de edad");
        }
    
        else
        {
            if(edad ==18)
            {
                System.out.println("Tienes exactamente 18");
            }
            
            else{
                System.out.println("Eres menor de edad");
            }
        }
    }
    
}
