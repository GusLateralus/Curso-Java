package logica;


public class Camion extends Vehiculo{

    public Camion(String color, String tipoVehiculo) {
        super(color, tipoVehiculo);
    }
    
    
    @Override
    public void mover()
    {
        System.out.println("El camion esta llevando carga");
    
    }
    
}
