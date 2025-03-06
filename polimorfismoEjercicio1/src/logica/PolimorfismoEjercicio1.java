
package logica;


public class PolimorfismoEjercicio1 {

    
    public static void main(String[] args) {
        // Instanciamos clases:
        Carro carro1 = new Carro("Amarillo","Carro");
        Camion camion1 = new Camion("Rojo","Camion");
        Bicicleta bicicleta1 = new Bicicleta("Rosa", "Bicicleta");
        
        
        Vehiculo[] movimientoVehiculos = {carro1, camion1, bicicleta1};//new Vehiculo[3]; // No llames al constructor cuando crees un array de un objeto
        
        //movimientoVehiculos = {carro1, camion1, bicicleta1};// No es legal hacer esto, lo ideal es hacerlo desde arriba
        
        
        for(int i=0; i<movimientoVehiculos.length;i++)
        {
            movimientoVehiculos[i].mover();
      
        }
        
        
        
        
    }
    
}
