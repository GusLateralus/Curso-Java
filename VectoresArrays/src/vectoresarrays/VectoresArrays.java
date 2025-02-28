
package vectoresarrays;


public class VectoresArrays {

    
    public static void main(String[] args) {
        // Declaramos un vector de enteros con 8 espacios
        
        int numeros[]=new int [8];
        
        
        numeros[0]=15;
        numeros[1]=35;
        numeros[2]=5;
        numeros[3]=25;
        numeros[4]=45;
        numeros[5]=55;
        numeros[6]=65;
        numeros[7]=75;
        
        // mostrar el elemento de la 5ta posición
        System.out.println("El elemento de la 5ta posicion es: "+numeros[4]);
        
        // Quiero mostrar todos los valores:
        // Usamos el método length para calcular la longitud de mi vector
        for(int i=0;i<numeros.length;i++)
        {
            System.out.println("Estoy en el indice: "+i+" y su valor es: "+numeros[i]);
         
        }
        
        
        
    }
    
}
