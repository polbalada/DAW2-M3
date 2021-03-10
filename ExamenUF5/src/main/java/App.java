
//AUTOR: Pol
public class App {
    public static void main(String[] args) {
        Fotografies.afegir(2, 2, "Anonim", 1939, 1);
        Fotografies.afegir(2, 2, "Anonim", 1939, 1);
        Fotografies.afegir(1, 2, "Anonim", 1939, 1);
        Fotografies.afegir(1, 1, "Pere", 1939, 2);
        Fotografies.afegir(4, 1, "Joan", 1939, 2);
        Fotografies.afegir(5, 1, "Joan", 1939, 3);
        
        Fotografies.mostrar();
        
        
        Fotografies.eliminarUnaFotografia(5);
        Fotografies.mostrar();
        
        Fotografies.eliminarUnaFotografia(5);
        Fotografies.mostrar();
        
        Fotografies.recompteDeTemes();
    }

}
