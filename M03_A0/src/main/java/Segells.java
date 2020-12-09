
import java.util.Arrays;
import java.util.Comparator;


//AUTOR: Pol
public class Segells {
   final private static int MAX_SEGELLS=100;
   
   static private Segell[] segells = new Segell[MAX_SEGELLS];
   static private int nSegells=0;
   
   static void afegir(Segell s) {
        segells[nSegells]=s;
        nSegells++;
   }
   static void mostrarTots() {
        for(int n=0;n<nSegells;n++)
            System.out.println(segells[n]);
   }
   
   static void ordenar(){
       try {
           Arrays.sort(segells, Comparator.comparing(Segell::getPais));
       } catch (Exception e) {
       }
   }
   static void ordenar2(){
       try {
           Arrays.sort(segells, Comparator.comparing(Segell::getPais).thenComparing(Segell::getValor));
       } catch (Exception e) {
       }
   }
   
   static void ordenarComparable(){       
        Arrays.sort(segells,0,nSegells);
   }
}
