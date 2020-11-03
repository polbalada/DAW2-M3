/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pol
 */
import java.util.Scanner;
public class ExBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        // TODO code application logic here
        //EX1
//        for (int n=100;n<=110;n++){
//            System.out.println(n);
//        }
        
        //EX2
//        for (int n=512;n>=500;n--){
//            System.out.println(n);
//        }
        
        //EX3
//        for (int n=100;n<=120;n++){
//            if(n%2==0)
//                System.out.println(n);
//        }
        
        //EX4
//        for (int n=200, m=1;n>=50;n--){
//            if(n%2==0){
//                if(m%15==0){
//                    System.out.println(String.format("%3d, ",n));
//                }else{
//                    System.out.print(String.format("%3d, ",n));
//                }
//                m++;
//            }
//        }
        
        //EX5
//        int n=100;
//        while(n<=110){
//            System.out.println(n);
//            n++;
//        }
        
        //EX6
//        int n=100;
//        do{
//            System.out.println(n);
//            n++;
//        }while (n<=110);
        
        //EX7
        //EX7a
//        int d=0;
//        System.out.println("Valor:");
//        d = teclado.nextInt();
//        while (d>31||d<1){
//            System.out.println("Valor:");
//            d = teclado.nextInt();
//        }
        //EX7b
//        int d;
//        do{
//            System.out.println("Valor:");
//            d = teclado.nextInt();
//        }while(d>31||d<1);

        //EX8
        String d;
        do{
            System.out.println("Valor:");
            d = teclado.next();
        }while(!isDigit(d) || Integer.parseInt(d)>31);

        //EX9
//        for(int n=1;n<10;n++){
//            for(int m=0;m<10;m++){
//                System.out.print(""+n+m+" ");
//            }
//            System.out.print("\n");
//        }

        //EX10
//        int c,d,u,r;
//        for(int n=100;n<500;n++){
//            c=n/100;
//            r=n%100;
//            d=r/10;
//            u=r%10;
//            if (n==Math.pow(c,3)+Math.pow(d,3)+Math.pow(u,3)){
//                System.out.println("El num: "+n+" es narcicista");
//            }
//        }
        
        //EX11
//        int suma=0;
//        int suma2=0;
//        for(int n=10;n<100;n++){
//            for(int m=n;m<100;m++){
//                suma+=n*m;
//            }
//        }
//        System.out.println(suma);
//        
//        for(int n=10;n<100;n++){
//            for(int m=n;m<100;m++){
//                if(n!=m)
//                    suma2+=n*m;
//            }
//        }
//        System.out.println(suma2);
    }
    public static boolean isDigit(String cadena){
        return cadena.matches("[0-9]+");
    }
}
