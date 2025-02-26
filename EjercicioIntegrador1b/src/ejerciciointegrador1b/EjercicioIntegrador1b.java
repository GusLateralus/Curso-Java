
package ejerciciointegrador1b;

import java.util.Scanner;

public class EjercicioIntegrador1b {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        int rangoEdad = 0;
        
        System.out.println("Digite la edad de su hijo(a): ");
        edad = teclado.nextInt();
        
        if(edad>=4 && edad <=6)
        {
            rangoEdad = 1;
        }
        
        else if(edad >=7 && edad <=8)
        {
            rangoEdad=2;
        }
        
        else if (edad >=9 && edad<=10)
        {
            rangoEdad=3;
        }
        
        else if(edad >= 11 && edad<=13)
        {
            rangoEdad = 4;
        }
        
        switch(rangoEdad){
            case 1:
                System.out.println("Grupo: Kinder");
                System.out.println("Horario: Lunes y miércoles de 16:00 a 17:00");
                break;
            case 2:
                System.out.println("Grupo: 1st year");
                System.out.println("Horario: Martes y jueves de 16:30 a 17:30");
                break;
            case 3:
                System.out.println("Grupo: 2nd year");
                System.out.println("Horario: Martes y jueves de 17:30 a 19:00");
                break;
            case 4:
                System.out.println("Grupo: 3rd year");
                System.out.println("Horario: Lunes y miércoles de 17:00 a 18:30");
                break;
            default:
                System.out.println("Su hijo(a) no está en nuestro sistema");
                break;
        }
    }
    
}
