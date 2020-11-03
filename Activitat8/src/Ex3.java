/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pol
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v1[]={1,2,3,4,5}, v2[]={1,2,3,4,5,6};
        
        //V1
//        int espar=v1.length%2;
//        int mitad=v1.length/2;
//        int c=0;
//        
//        if (espar!=0)
//            mitad++;
//        
//        for(int n=0,m=mitad;n<mitad;n++,m++){
//            c=v1[n];
//            v1[n]=v1[m];
//            v1[m]=c;
//        }
        System.out.println(""+v1[0]+v1[1]+v1[2]+v1[3]+v1[4]);
        
        
        //V2
        int espar2=v2.length%2;
        int mitad2=v2.length/2;
        int c2=0;
        
        if (espar2!=0)
            mitad2++;
        
        for(int n=0,m=mitad2;n<mitad2;n++,m++){
            c2=v2[n];
            v2[n]=v2[m];
            v2[m]=c2;
        }        
        System.out.println(""+v2[0]+v2[1]+v2[2]+v2[3]+v2[4]+v2[5]);
        
    }
    
}
