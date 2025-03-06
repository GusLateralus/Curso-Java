package polimorfismojava;


public class PolimorfismoJava {

    
    public static void main(String[] args) {
        Vehiculo miVehiculo1 = new Carro();
        Vehiculo miVehiculo2 = new Moto();
        
        miVehiculo1.mover();  // Salida: "El carro está conduciendo"
        miVehiculo2.mover();  // Salida: "La moto está acelerando"
    }
}
    

