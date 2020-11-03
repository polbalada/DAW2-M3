//AUTOR: Pol
public class Ex14 {
    public static String mataBruixa(String cad){
        int i = cad.indexOf("=()=");
        if (i != -1)
             return cad.substring(0,i) + cad.substring(i+4);
        return cad;
    }
    public static int mataBruixes(String cad){
        int contador=0;
        while (cad.contains("=()=")){
            cad=mataBruixa(cad);
            contador++;
        }
        return contador;
    }
    public static void main(String[] args) {
        System.out.println(mataBruixes("()=()(=()=(=======))))((((=(=(=()==()==()=((()"));
    }

}
