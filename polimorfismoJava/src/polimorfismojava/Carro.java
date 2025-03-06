package polimorfismojava;


public class Carro extends Vehiculo {
    @Override // Esta annotation significa sobreescritura de un método.
    public void mover() {
        System.out.println("El carro está conduciendo");
    }
}


