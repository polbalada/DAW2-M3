/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pol
 */
public class bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s="Hola que tal";
//        for (int n=0;n<s.length();n++){
//            System.out.println(s.charAt(n));
//        }
//        for (int n=(s.length()-1);n>=0;n--){
//            System.out.println(s.charAt(n));
//        }
        
        for (int n=(s.length()-1), m=0;n>=0;n--,m++){
            System.out.println(s.charAt(n)+" "+s.charAt(m));
        }
    }
    
}
