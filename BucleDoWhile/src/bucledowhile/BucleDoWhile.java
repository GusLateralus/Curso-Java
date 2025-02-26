
package bucledowhile;


public class BucleDoWhile {

    
    public static void main(String[] args) {
        int contador = 0;
        
        do{
            System.out.println("Estoy en la vuelta "+(contador+1));    
            contador++; // contador +=1;
        
        }while(contador < 10);
    }
    
}
