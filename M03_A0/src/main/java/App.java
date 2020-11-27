
import java.time.LocalDate;

//AUTOR: Pol
public class App {
    public static void main(String[] args) {
        Segell s1 = new Segell(100, LocalDate.now());
        Segell s2 = new Segell(100, LocalDate.now());
        Segell s3 = new Segell(100, LocalDate.now());
        Segell s4 = s1;
        
        Segells.afegir(s1);
        Segells.afegir(s2);
        Segells.afegir(s3);
        Segells.afegir(s4);
        
        System.out.println(s1.equals(s2));
        Segells.mostrarTots();
    }

}
