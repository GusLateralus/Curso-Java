package poo.mycompany.Perro;

// Definimos la clase animal que contendrá todos los atributos y métodos de este objeto
public class Perro{
    // Atributo
    private String nombre;
    
    //Constructor
    public Perro(String nombre)
    {
        this.nombre = nombre;   
    }
    
    //Método
    public void hacerSonido()
    {
        System.out.println("Guau"); 
    }
    
    
    //Getter y Setter (Encapsulamiento)
    public String getNombre()
    {
        return nombre;
    }
    
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    
    }
    
}


public class Mavenproject1 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
    }
}
