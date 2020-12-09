
import java.time.LocalDate;

//AUTOR: Pol
public class App {
    public static void main(String[] args) {
        Segell s1 = new Segell(100, LocalDate.now(),"Espanya");
        Segell s2 = new Segell(80, LocalDate.now(), "Portugal");
        Segell s3 = new Segell(90, LocalDate.now(), "Alemanya");
        Segell s4 = new Segell(110, LocalDate.now(), "Espanya");
        Segell s5 = s1;
        
        Segells.afegir(s1);
        Segells.afegir(s2);
        Segells.afegir(s3);
        Segells.afegir(s4);
        Segells.afegir(s5);
        
        System.out.println(s1.equals(s2));
        Segells.mostrarTots();
        
        System.out.println("\nOrdenat per Pais");
        Segells.ordenar();
        Segells.mostrarTots();
        
        System.out.println("\nOrdenat per Pais i Valor");
        Segells.ordenar2();
        Segells.mostrarTots();
        
        System.out.println("\nOrdenat per Pais i Valor amb Comparable");
        Segells.ordenarComparable();
        Segells.mostrarTots();
    }

}
