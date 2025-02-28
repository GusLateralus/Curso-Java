package vectoresejercicio3;

import java.util.Scanner;

/*
Un empleado desea almacenar en un vector sus 12 sueldos del año.
A partir de esto, necesita un programa que determine y muestre por pantalla
la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.
*/

public class VectoresEjercicio3 {

    
    public static void main(String[] args) {
        double sueldos[] = new double[12];
        double sumTotal =0.0, promedio;
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0; i<sueldos.length; i++)
        {
            System.out.println("Digite el sueldo número "+(i+1)+": ");
            sueldos[i] = teclado.nextDouble();
            sumTotal = sumTotal+sueldos[i]; // Creo que también se puede escribir como sumTotal +=sueldos[i];
        }
        
        // Promediamos
        promedio = sumTotal/sueldos.length;
        
        System.out.println("La suma total de sus sueldos en el anio fue: "+sumTotal);
        System.out.println("Y el promedio de sus sueldos fue: "+promedio);
        
    }
    
}
