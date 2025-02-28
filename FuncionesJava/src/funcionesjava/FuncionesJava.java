
package funcionesjava;


public class FuncionesJava {
    
    // Definimos una función para sumar
    static int sumaNumeros(int a, int b)
    {
        int resultado = a+b;
        return resultado;
    
    }
    
    
    
    // Se puede omitir public, debido a que no se mandará a llamar desde otros archivos
    static void saludarDesdeJava(String mensaje){
        System.out.println("Mensaje: "+mensaje);
    
    }
    
    
    public static void main(String[] args) {
        int arg1=3, arg2=8, sum=0;
        
        sum = sumaNumeros(arg1, arg2);
        System.out.println("Suma de números: "+sum);
        
        
        saludarDesdeJava("Hola mundo");
        
    }
    
    
    
}
