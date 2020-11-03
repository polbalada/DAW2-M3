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
public class ExamenEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejer-1
        int movimientos[]={-50,-150,-60,800,-80,-300,-230,-90,850,-30,-600,-50,-150,-30,-40};
        
        //Ejer-2
        Scanner Scanner = new Scanner(System.in);
        String contrasenya;
        String contrasenya_correcte="HOLA";
        int intents=3;
        do{
            if(intents<=0)
                System.exit(-1);
            System.out.println("Introdueix la contrasenya: ");
            contrasenya = Scanner.next();
            intents--;
        }while(!contrasenya_correcte.equals(contrasenya));
        
        //Ejer-3
        int saldo=300;
        for(int i=0;i<movimientos.length;i++){
            //System.out.print("Moviment-> " + movimientos[i] + " ");
            saldo+=movimientos[i];
            //System.out.print("Saldo-> "+ saldo + "\n");
        }
        System.out.println(saldo);
        
        //Ejer-4
        System.out.println("Quants diners vols retirar? ");
        int solicitud_de_retirada= Scanner.nextInt();
        if (saldo<solicitud_de_retirada){
            System.out.println("Ho sentim no disposes de suficient saldo");
            System.exit(-2);
        }else if(solicitud_de_retirada==0){
            System.out.println("Has escolllit la opció SORTIR");
            System.exit(-2);
        }else{
            System.out.println("Saldo anterior-> " + saldo);
            System.out.println("Quantitat retirada-> " + solicitud_de_retirada);
            saldo-=solicitud_de_retirada;
            System.out.println("Saldo actual-> " + saldo);
        }
        
        //Ejer-5
        System.out.println(java.util.Arrays.toString(movimientos));
        for(int i=movimientos.length-1;i>0;i--){
            movimientos[i]=movimientos[i-1];
        }
        movimientos[0]=-solicitud_de_retirada;
        System.out.println(java.util.Arrays.toString(movimientos));
        
        //Ejer-6
        //System.out.println("");
        String probabilitats="1111122223";
        char resultat=probabilitats.charAt((int)(Math.random()*probabilitats.length()));
        System.out.println(resultat);
        switch (resultat) {
            case '1':
                System.out.println("Enorabona has guanyat un Clauer Seriegrafiat conmemoratiu");
                break;
            case '2':
                System.out.println("Enorabona has guanyat un Boligraf de propaganda conmemoratiu");
                break;
            default:
                int premi;
                do{premi=(int)(Math.random()*20);
                }while(premi<5);
                System.out.println("Enorabona has guanyat " + premi + "€!");
                break;
        }
    }
    
}
