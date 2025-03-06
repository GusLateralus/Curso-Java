
package logica;


public class Carro extends Vehiculo{
    
    public Carro(String color, String tipoVehiculo)
    {
        super(color, tipoVehiculo);
        
    }
    
    @Override
    public void mover()
    {
        System.out.println("El carro se esta conduciendo");
    }
    
}
