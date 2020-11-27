
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
}
