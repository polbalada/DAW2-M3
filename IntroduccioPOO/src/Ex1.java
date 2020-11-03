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
class Tiempo{
        private int hora;
        private int minuts;
        private int segons;

        public int getHora() {
            return hora;
        }

        public int getMinuts() {
            return minuts;
        }

        public int getSegons() {
            return segons;
        }

        public void setHora(int hora) {
            this.hora = hora;
        }

        public void setMinuts(int minuts) {
            this.minuts = minuts;
        }

        public void setSegons(int segons) {
            this.segons = segons;
        }
        
        public String ToString(){
            return ""+hora+":"+minuts+":"+segons;
        }

        public Tiempo(int hora, int minuts, int segons) {
            this.hora = hora;
            this.minuts = minuts;
            this.segons = segons;
        }

        public Tiempo(int hora, int minuts) {
            this(hora,minuts,0);
        }

        public Tiempo() {
        }
        
    }
public class Ex1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introdueix la hora: ");
        int hora=teclado.nextInt();
        System.out.print("Introdueix la min: ");
        int min=teclado.nextInt();
        System.out.print("Introdueix la seg: ");
        int seg=teclado.nextInt();
        Tiempo MyObj = new Tiempo(hora,min,seg);
        System.out.println(MyObj.ToString());
    }
    
}
