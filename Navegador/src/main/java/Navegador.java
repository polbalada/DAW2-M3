//AUTOR: Pol
public class Navegador {
    private static Historial historial;
    private static Interes interes;
    
    public static void anar(String url){
        Barra.setUrl(url);
        Historial.afegir(url);
        //System.out.println(Barra.getUrl());
    }
    public static void enrere(){
        
    }
    public static void endevant(){
        
    }
    public static void interes(){
        
    }
}
