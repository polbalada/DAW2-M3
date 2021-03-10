
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//AUTOR: Pol
public class Fotografies {
    private static Map<Integer,Fotografia> fotografies = new TreeMap<>();
    
    public static void afegir(int codi, int nCopia, String autor, int any, int temes){
        fotografies.put(codi, new Fotografia(nCopia, autor, any, temes));
    }
    
    public static void mostrar(){
        System.out.println("\nLLista");
        for(Map.Entry<Integer, Fotografia> e: fotografies.entrySet()){
            System.out.println(e.getKey() + "-" + e.getValue());
        }
    }
    
    public static void eliminarUnaFotografia(int clau)/* throws Exception*/{
//        if(!fotografies.containsKey(clau))
//            throw new FotoNotFoundException("No trobada");
        fotografies.remove(clau);
    }
    
    public static void recompteDeTemes(){
        Map<List, Integer> mapa = new HashMap<>();
        
        for(Map.Entry<Integer, Fotografia> e: fotografies.entrySet()){
            List tema = fotografies.get(e.getKey()).getTemes();
            int nVegades = 1;
            if(mapa.containsKey(tema))
                nVegades = mapa.get(tema) +1;
            mapa.put(tema,nVegades);
        }
        
        //System.out.println(mapa);
        System.out.println("\nTemes");
        for(Map.Entry<List, Integer> e: mapa.entrySet()){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
