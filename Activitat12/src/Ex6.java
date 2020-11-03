//AUTOR: Pol
public class Ex6 {
    public static int quantesVocals(String cad, String sonVocals){
        int contador=0;
        char vocal;
        for (int i=0;i<sonVocals.length();i++){
            vocal = sonVocals.charAt(i);
            for (int n=0;n<cad.length();n++){
                if(cad.charAt(n)==vocal){
                    contador++;
                }
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        System.out.println(quantesVocals("Ara no el trobarà","aeiou"));
    }

}
