//AUTOR: Pol
public class Navegador {
    //Funció per a evitar que s'esperi al executar una pagina i no solaparse al historial
    public static void wait(int ms){
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    private static Historial historial;
    private static Interes interes;
    
    public static void anar(String url){
        Barra.setUrl(url);
        Visitats.afegir(url);
        Historial.afegir(url);
        wait(50);
        //System.out.println(Barra.getUrl());
    }
    
    
}
