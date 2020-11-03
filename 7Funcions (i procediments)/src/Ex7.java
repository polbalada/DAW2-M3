//AUTOR: Pol
import java.util.*;
public class Ex7 {

    public static String nif(int dni){
        char lletra="TRWAGMYFPDXBNJZSQVHLCKE".charAt(dni % 23);
        String nif = "" + dni + lletra;
        return nif;
    }
    public static void main(String[] args) {
        java.util.Scanner entrada=new java.util.Scanner(System.in);
        System.out.println("Introdueix num DNI");
        int valor_llegit = entrada.nextInt();
        if (valor_llegit > 9999999 && valor_llegit <=99999999)
            System.out.println(nif(valor_llegit));
        else
            System.out.println("Numero de caracters incorrecte");
    }

}
