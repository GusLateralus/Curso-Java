package ejerciciointegradormerceria;

import java.util.Scanner;

public class EjercicioIntegradorMerceria {

    
    public static void main(String[] args) {
        // Dependiendo de la cantidad de productos, se mandarán ciertos mensajes
        // Dependiendo de la cantidad de monto, se aplican ciertas promociones
        // No es buena idea mezclar tipos de variable para una misma instancia de Scanner, ya que puede crear conflictos
        // Lo recomendable es reiniciarlo y volver a usarlo si es que lo ocupas para variables de distinto tipo
        // Luisina considera para las promociones el monto total (envío + productos). Puedes hacer una nueva versión de esto
        Scanner teclado = new Scanner(System.in);
        int numeroProductos;
        double montoTotal, descuentoMonto;

        System.out.println("Digite la cantidad de productos a comprar: ");
        numeroProductos = teclado.nextInt();
        
        if (numeroProductos < 5) {
            if (numeroProductos < 0) {
                System.out.println("No se permiten compras negativas");
            }
            
            else{
            System.out.println("No se permiten compras inferiores a 5");
            }
        } 
        else{ 
            // Si se compran más de 5 productos, preguntamos por el monto
            System.out.println("Digite el monto total de la compra: ");
            teclado = new Scanner(System.in); // Aquí volvemos a inicializar el teclado
            montoTotal = teclado.nextDouble();
            
            if(montoTotal < 100)
            {   
                if(montoTotal < 0)
                {
                    System.out.println("No puede tener un monto negativo.");
                }
                
                else{
                descuentoMonto = 100 - montoTotal;
                System.out.println("No hay promociones disponibles, necesita: "+descuentoMonto+
                        " USD en el monto para acceder a una");
                }
            }
            
            else
            {
                if(montoTotal >= 100 && montoTotal <= 300)
                {
                    descuentoMonto = 0.05*montoTotal;
                    //montoTotal -= descuentoMonto; 
                    System.out.println("Tiene un 5% de descuento de su monto total.");
                }
                
                else
                {
                    descuentoMonto = 0.1*montoTotal;
                    //montoTotal -= descuentoMonto; 
                    System.out.println("Tiene un 10% de descuento de su monto total.");
                }
                
                montoTotal -= descuentoMonto; // No es necesario que repitas esta línea de código
            }
            
            if (numeroProductos >= 5 && numeroProductos <= 15) {
            
            System.out.println("El costo del envío es de $10 USD");
            System.out.println("El monto total de la compra es: "+(montoTotal+10.0));
            } 
            else {
            System.out.println("El envío es gratuito");
            System.out.println("El monto total de la compra es: "+montoTotal);
            }
        }
    }
    
}
