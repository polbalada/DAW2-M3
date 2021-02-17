
import java.util.Deque;
import java.util.LinkedList;

//AUTOR: Pol
public class Visitats {
    private static Deque<String> visitats = new LinkedList<>();
    
    public static void afegir(String url){
       visitats.push(url);
    }
    public static void mostrar(){
        while(!visitats.isEmpty()){
            System.out.println(visitats.pop());
        }
    }
}
