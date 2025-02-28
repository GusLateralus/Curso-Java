// Crea una clase llamada "Aritmética", con los atributos operando1 y operando2
// Deberás crear métodos para hacer las 4 operaciones fundamentales con los parámtros
// que reciba
package pooejercicio1;


public class Aritmetica {
    
    // Atributos de clase
    double operando1;
    double operando2;
    
    // Métodos:
    // Si ya tienes los atributos como variables globales, no es necesario pasarle
    // atributos a los métodos.
    // Cuando no hay bucles, si es conveniente declarar e inicializar la variable en la misma línea.
    // En este contexto, incluso te conviene retornar directamente.

    // Método constructor:
    public Aritmetica(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }
    
    
    public double sumarOperandos()
    {
        //double sum=0.0;
        //sum = operando1+operando2;
        
        return operando1+operando2;
    
    }
    
    public double restarOperandos()
    {
        
        return operando1-operando2;
    
    }
    
    public double multOperandos()
    {
        return operando1*operando2;
    
    }
    
    public double dividirOperandos()
    {
        return operando1/operando2;
    
    }
    
    
    public static void main(String[] args) {
        // Debemos crear un objeto de la clase Aritmetica
        var calculo1 = new Aritmetica(3.0,6.0);
        double suma, rest, mult, div;
        
        // Le damos valores a sus atributos:
        //calculo1.operando1 = 3.0;
        //calculo1.operando2 = 6.0;
        
        // Y mandamos a llamar a sus métodos:
        suma = calculo1.sumarOperandos();
        rest = calculo1.restarOperandos();
        mult = calculo1.multOperandos();
        div = calculo1.dividirOperandos();
       
        // E imprimimos resultados:
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+rest);
        System.out.println("Multiplicacion: "+mult);
        System.out.println("Division: "+div);
        
       
    }
    
}
