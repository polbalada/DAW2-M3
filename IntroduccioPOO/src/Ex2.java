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

public class Ex2 {
    static class Tiempo{
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
    
    static class Fecha{
        private int dia;
        private int mes;
        private int any;

        public int getHora() {
            return dia;
        }

        public int getMinuts() {
            return mes;
        }

        public int getSegons() {
            return any;
        }

        public void setHora(int dia) {
            this.dia = dia;
        }

        public void setMinuts(int mes) {
            this.mes = mes;
        }

        public void setSegons(int any) {
            this.any = any;
        }
        
        public String ToString(){
            return ""+dia+":"+mes+":"+any;
        }

        public Fecha(int dia, int mes, int any) {
            this.dia = dia;
            this.mes = mes;
            this.any = any;
        }

        public Fecha(int dia, int mes) {
            this(dia,mes,0);
        }

        public Fecha() {
        }
    /**
     * @param args the command line arguments
     */
    
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
    
    }}
