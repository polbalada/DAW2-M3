
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

//AUTOR: Pol
public class Historial {
    private static Map<LocalDateTime, String> historial = new HashMap<>();

    static void afegir(String url) {
        LocalDateTime a = LocalDateTime.now();
        historial.put(a,url);
;
    }
    static void mostrar(){
        for(Map.Entry<LocalDateTime, String> e: historial.entrySet()){
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}
