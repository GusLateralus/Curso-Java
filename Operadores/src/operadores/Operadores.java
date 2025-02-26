package operadores;

import java.util.Scanner;


public class Operadores {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner teclado = new Scanner(System.in);
        double num1, num2, suma,resta,mult,div,residuo;
        
        System.out.println("Ingrese el primer número a operar: ");
        num1 = teclado.nextDouble();
        
        System.out.println("Ingrese el segundo número a operar: ");
        num2 = teclado.nextDouble();
        
        suma = num1+num2;
        resta = num1-num2;
        mult = num1*num2;
        div = num1/num2;
        residuo = num1%num2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicación resulta: "+mult);
        System.out.println("La división resulta: "+div);
        System.out.println("El residuo es: "+residuo);
        
    }
    
}
