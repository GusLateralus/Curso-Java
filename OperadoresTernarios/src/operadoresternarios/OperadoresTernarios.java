package operadoresternarios;

import java.util.Scanner;


public class OperadoresTernarios {

    
    public static void main(String[] args) {
        // Operadores ternarios: Se utiliza para evaluar una condición simple en una sola línea de código.
        // Sintaxis: variable = (condicion) ? valor_si_verdadero : valor_si_falso;
        
        // Programa que dependiendo del promedio de un alumno, nos diga si aprobó o no una materia
        Scanner teclado = new Scanner(System.in);
        double promedio;
        String condicionFinal;
        
        System.out.println("Digite su promedio: ");
        promedio = teclado.nextDouble();
        
        condicionFinal = (promedio >= 6.0) ? "Aprobado": "Reprobado";
        System.out.println("De acuerdo a su promedio, usted está: "+condicionFinal);
    }
    
}
