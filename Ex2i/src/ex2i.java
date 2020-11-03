
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author polba
 */
public class ex2i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        String text;
        System.out.println ("Introduce una palabra");
        text= Scanner.next();
        
        char primeralletra= text.charAt(0);
        switch (primeralletra){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println ("Vocal");
                break;
            default:
                System.out.println ("Consonant");       
        }
    }
}
