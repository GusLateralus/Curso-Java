package logica;

import java.util.Scanner;

public class PooEjercicio2 {
    
    //Scanner teclado = new Scanner(System.in);
    
    
    public static void seleccionarOpcion(Scanner teclado, CuentaBancaria cuentaBanco)
    {
        int opc;
        double monto;
        
        do{
            System.out.println("*****BIENVENIDO*******");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            System.out.println("Digite una opción: ");
            teclado = new Scanner(System.in);
            opc = teclado.nextInt();
            
            switch(opc)
        {
            case 1:
                System.out.println("Digite la cantidad a depositar: ");
                monto = teclado.nextDouble();
                cuentaBanco.saldo=cuentaBanco.depositarEfectivo(monto);
                break;
            case 2:
                System.out.println("Digite la cantidad a retirar");
                monto = teclado.nextDouble();
                cuentaBanco.saldo=cuentaBanco.retirarEfectivo(monto);
                break;
            case 3: 
                cuentaBanco.consultarSaldo();
                break;
            case 4:
                System.out.println("Hasta la proxima");
                break;
        
        }
            
        }while (opc != 4);
        
       
    }
    
    public static void main(String[] args) {
        // Variables a utilizar:
        String nombreUsuario;
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Ingrese su nombre: ");
        nombreUsuario = teclado.nextLine();
        
        // Creamos un objeto de cuenta bancaria: 
        CuentaBancaria cuentaDeBanco = new CuentaBancaria(nombreUsuario, 500.0);
        
        
        seleccionarOpcion(teclado, cuentaDeBanco);
        
        
        
        
    }
    
}
