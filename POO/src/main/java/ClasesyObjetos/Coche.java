
package ClasesyObjetos;

/**
 *
 * @author gusla
 */
public class Coche {
    // Atributos
    String color;
    String marca;
    int km;
    
    //Métodos
    public static void main(String [] args){
        Coche coche1 = new Coche();  //Constructor
        Coche coche2 = new Coche();
        
        
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        coche2.color = "Negro";
        coche2.marca = "Volkswagen";
        coche2.km = 3000;
        
        System.out.println("El color del coche1 es: "+coche1.color);
        System.out.println("La marca del coche1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche es: "+coche1.km);
        
        
        System.out.println("El color del coche1 es: "+coche2.color);
        System.out.println("La marca del coche1 es: "+coche2.marca);
        System.out.println("El kilometraje del coche es: "+coche2.km);
    }
}
