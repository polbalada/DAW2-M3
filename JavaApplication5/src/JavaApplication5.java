/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pol
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EX1
//        int contador=0;
//        for (int x=1;x<=3;x++){
//            for(int y=1;y<=3;y++){
//                System.out.println("Persona A recibe:" + x + " Persona B recibe: " + y);
//                contador ++;
//            }
//        }
//        System.out.println("\nHay un total de " + contador + " combinaciones.");
        //EX2
//        int contador=0;
//        for (int x=1;x<=3;x++){
//            for(int y=1;y<=3;y++){
//                if(x!=y){
//                    System.out.println("Persona A recibe:" + x + " Persona B recibe: " + y);
//                    contador ++;
//                }
//            }
//        }
//        System.out.println("\nHay un total de " + contador + " combinaciones.");
        //EX3
//        int contador=0;
//        for (int x=1;x<=3;x++){
//            for(int y=x;y<=3;y++){
//                System.out.println("Persona A recibe:" + x + " Persona B recibe: " + y);
//                contador ++;
//                
//            }
//        }
//        System.out.println("\nHay un total de " + contador + " combinaciones.");
        //EX4
//        int contador=0;
//        for (int x=1;x<=3;x++){
//            for(int y=x+1;y<=3;y++){
//                System.out.println("Persona A recibe:" + x + " Persona B recibe: " + y);
//                contador ++;
//            }
//        }
//        System.out.println("\nHay un total de " + contador + " combinaciones.");

        //EX5
//        int contador=0;
//        for(int m=3;m<=6;m+=3){
//            for(int c=3;c<=6;c+=3){
//                for(int d=3;d<=6;d+=3){
//                    for (int u=3;u<=6;u+=3){
//                        if(!(m==c&&d==u&&m==u)){
//                            System.out.println(""+m+c+d+u);
//                            contador ++;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("Hi ha "+contador+" possibilitats");
        
        //EX6
//        int contador=0;
//        for (int x=3;x<=6;x+=3){
//            for (int y=3;y<=6;y+=3){
//                for(int m=3;m<=6;m+=3){
//                    for(int c=3;c<=6;c+=3){
//                        for(int d=3;d<=6;d+=3){
//                            for (int u=3;u<=6;u+=3){
//                                if(!(x==y&&m==c&&d==u&&m==u&&x==u)){
//                                    System.out.println(""+x+y+m+c+d+u);
//                                    contador ++;
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("Hi ha "+contador+" possibilitats");
//    
        //EX7
        int contador=0;
        for (int x=1;x<=5;x+=2){
            for (int y=1;y<=5;y+=2){
                for(int m=1;m<=5;m+=2){
                    for(int c=1;c<=5;c+=2){
                        for(int d=1;d<=5;d+=2){
                            for (int u=1;u<=5;u+=2){
                                if(!(x==y&&m==c&&d==u&&m==u&&x==u)){
                                    System.out.println(""+x+y+m+c+d+u);
                                    contador ++;
                                }
                            }
                        }
                    }
                }
            }
        }
    System.out.println("Hi ha "+contador+" possibilitats");
    }
    
}
