
import java.util.ArrayList;

//AUTOR: Pol
public class Historial {
    private static ArrayList<String> historial = new ArrayList <>();

    static void afegir(String url) {
        historial.add(url);
    }
    static void mostrar(){
        //System.out.println(historial.toString());
        for(String h: historial){
            System.out.println(h);
        }
    }
}
