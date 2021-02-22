
import java.util.Deque;
import java.util.LinkedList;

//AUTOR: Pol
public class Visitats {
    private static Deque<String> visitats = new LinkedList<>();
    private static Deque<String> visitats_endevant = new LinkedList<>();
    
    public static void afegir(String url){
       visitats.push(url);
    }
    public static void enrere(){
        String url = visitats.pop();
        visitats_endevant.push(Barra.getUrl());
        //Barra.setUrl(url);
        Navegador.anar(url);
    }
    public static void endevant(){
        Barra.setUrl(visitats_endevant.pop());
    }
    
    
    
}
