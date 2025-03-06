
package logica;


public class Bicicleta extends Vehiculo{

    public Bicicleta(String color, String tipoVehiculo) {
        super(color, tipoVehiculo);
    }
    
    @Override
    public void mover()
    {
        System.out.println("La bicicleta esta pedaleando");
    
    }
    
    
}
