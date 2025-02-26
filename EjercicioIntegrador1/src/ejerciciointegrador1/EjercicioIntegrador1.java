package ejerciciointegrador1;
// Ejercicio de escuela de inglés
// a) Resuelve el ejercicio utilizando sentencia switch
// b) Resuelve el ejercicio utilizando condicionales if-else (hecho)

import java.util.Scanner;


public class EjercicioIntegrador1 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        
        System.out.println("Digite la edad de su hijo(a): ");
        edad = teclado.nextInt();
        
        if(edad>=4 && edad <=6)
        {
            System.out.println("Grupo: Kinder");
            System.out.println("Horario: Lunes y miércoles de 16:00 a 17:00");
        }
        
        else if(edad >=7 && edad <=8)
        {
            System.out.println("Grupo: 1st year");
            System.out.println("Horario: Martes y jueves de 16:30 a 17:30");
        }
        
        else if (edad >=9 && edad<=10)
        {
            System.out.println("Grupo: 2nd year");
            System.out.println("Horario: Martes y jueves de 17:30 a 19:00");
        }
        
        else if(edad >= 11 && edad<=13)
        {
            System.out.println("Grupo: 3rd year");
            System.out.println("Horario: Lunes y miércoles de 17:00 a 18:30");
        }
        
        else
        {
            System.out.println("Su hijo(a) no está en nuestro sistema");
        }
        
        
        
    }
    
}
