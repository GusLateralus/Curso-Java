// Clase madre
package logica;


public class Vehiculo{
    
    // Atributos
    private String color;
    private String tipoVehiculo;
    
    //Constructor
    public Vehiculo(String color, String tipoVehiculo)
    {
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
    }
    //Getters y Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
    //Métodos:
    public void mover()
    {
        System.out.println("El vehiculo se esta moviendo");
    }
  
}
