//AUTOR: Pol
public class Ex13 {
    public static String mataBruixa(String cad){
        int i = cad.indexOf("=()=");
        if (i != -1)
             return cad.substring(0,i) + cad.substring(i+4);
        return cad;
    }
    public static void main(String[] args) {
        System.out.println(mataBruixa("()=()(=()=(=======))))((((=(=(((()"));
    }

}
