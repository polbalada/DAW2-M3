
import java.util.ArrayList;

//AUTOR: Pol
public class Interes {
    private static ArrayList<String> interes = new ArrayList <>();
    
    static void afegir() {
        if(!interes.contains(Barra.getUrl()))
            interes.add(Barra.getUrl());
    }
    static void mostrar(){
        for(String i: interes){
            System.out.println(i);
        }
    }
}
