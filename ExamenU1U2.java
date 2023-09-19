
package examenu1u2;
import java.util.Scanner;

/**
 *
 * @author sandy
 */
public class ExamenU1U2 {

  
    public static void main(String[] args) {
       Scanner  ExamenU1U2 = new Scanner (System.in);
       
        System.out.println(" Ingrese el nombre del videojuegouno ");
        String videojuegouno = ExamenU1U2.nextLine();
        System.out.println(" Ingrese el nombre del videojuegodos ");
        String videojuegodos = ExamenU1U2.nextLine();
        System.out.println(" Ingrese el nombre del videojuegotres ");
        String videojuegotres = ExamenU1U2.nextLine();
        
        
        System.out.println(" Ingrese el precio del videojuego1 ");
        double videojuego1 = ExamenU1U2.nextDouble();
        System.out.println(" Ingrese el precio del videojuego2 ");  
        double videojuego2 = ExamenU1U2.nextDouble();
        System.out.println(" Ingrese el precio del videojuego3 ");  
        double videojuego3 = ExamenU1U2.nextDouble();
        
        
      double Descuento1 = videojuego1 - ( videojuego1 * 30/100 );
      System.out.println(" El precio final del primer videojuego: " + Descuento1);
      double Descuento2 = videojuego2 - ( videojuego2 * 65/100 );
      System.out.println(" El precio del segundo videjuego: "+ Descuento2);
      double Descuento3 = videojuego3 - ( videojuego3 * 15/100 );
      System.out.println(" El precio del tercer videojuego: " +Descuento3);
     Scanner close;
  
    }
    
}
