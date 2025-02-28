// Aquí irán los atributos y métodos de la clase CuentaBancaria
package logica;

import java.util.Scanner;


public class CuentaBancaria {
    // Atributos
    String titular;
    double saldo;
    Scanner teclado = new Scanner(System.in);
    
    // Definimos el constructor
    public CuentaBancaria(String titular, double saldo)
    {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    // Métodos
    public void consultarSaldo()
    {
        System.out.println("Estimado "+titular+", su saldo actual es: "+saldo);
    
    }
    
    public double retirarEfectivo(double monto)
    {
        
        while(monto > saldo)
        {
            System.out.println("No tiene suficientes fondos, digite otra cantidad: ");
            monto = teclado.nextDouble();
        
        }
        
        
        while(monto < 0)
        {
            System.out.println("No puede retirar cantidades negativas, inténtelo de nuevo: ");
            monto = teclado.nextDouble();
        
        }
          
        saldo -=monto;
        System.out.println("Retire su efectivo, por favor.");
        
    
        return saldo;
    }
    
    public double depositarEfectivo(double monto)
    {
        
        
        while(monto < 0)
        {
            System.out.println("No puede depositar una cantidad negativa, intente de nuevo: ");
            monto = teclado.nextDouble();
        
        }
        
        saldo += monto;
        
    
        return saldo;
    }
    
    
    
    
    
}
