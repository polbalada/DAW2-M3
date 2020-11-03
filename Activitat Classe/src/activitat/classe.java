/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activitat;
import java.util.Scanner;

/**
 *
 * @author polba
 */
public class classe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        int nota;
        System.out.println ("Introduce tu nota");
        nota= Scanner.nextInt();
        switch (nota){
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println ("Suspendido");
                break;
            case 5:
                System.out.println ("Aprobado");    
                break;
            case 6:
                System.out.println ("Bien");
                break;
            case 7:
            case 8:
                System.out.println ("Notable");
                break;
            case 9:
            case 10:
                System.out.println ("Excelente");
                break;
            default:
                System.out.println ("Pa tu casa");
        }
    }
    
}
