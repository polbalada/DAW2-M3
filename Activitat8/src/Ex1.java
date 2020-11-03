/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pol
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float vector[];
        vector = new float[1000];
        vector[5]=5;
        boolean trobat=false;
        for(int n=0;n<vector.length;n++){
            if (vector[n]!=0){
                System.out.println("Trobat el primer valor no nul en la posició "+n+" del vector. Valor trobat: "+vector[n]);
                trobat=true;
            }
        }
        if (!trobat){
            System.out.println("Tots els elements del vector valen 0.0, vector no inicialitzat.");
        }
    }
    
}
