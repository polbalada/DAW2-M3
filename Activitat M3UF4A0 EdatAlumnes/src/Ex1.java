//AUTOR: Pol
import java.util.Scanner;
public class Ex1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nom, curs, cicle;
        
        System.out.println("Cicle?");
        cicle = scan.nextLine(); // llegeix el retorn de carro
        
        System.out.print("Curs?");
        curs = scan.nextLine(); // llegeix el retorn de carro
        
        System.out.print("Nom?");
        nom = scan.nextLine(); // llegeix el retorn de carro
        
        System.out.println("Benvingut a "+cicle+curs+"! "+nom);
    }

}
