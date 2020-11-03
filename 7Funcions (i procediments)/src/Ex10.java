//AUTOR: Pol
import java.util.*;
public class Ex10 {
    public static String PedraPaperTisora (){
        return PedraPaper_O_Tisora((int)(Math.random()*3));
    }
    public static String PedraPaper_O_Tisora (int num){
        switch(num) {
            case 0:
              return "Pedra";
            case 1:
              return "Paper";
            default:
              return "Tisora";
        }
    }
    
    public static void main(String[] args) {
        java.util.Scanner entrada=new java.util.Scanner(System.in);
        System.out.println("Selecciona: \n1 -> Pedra\n2 -> Paper\n3 -> Tisora");
        int valor_llegit = entrada.nextInt();
        System.out.println("Has escollit: " + PedraPaper_O_Tisora(valor_llegit));
        System.out.println("CPU ha escollit: " + PedraPaperTisora());
    }

}
