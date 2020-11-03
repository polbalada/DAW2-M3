//AUTOR: Pol
public class Ex12 {
    public static String explanadaBruixes(int n, int bruixes){
        if(bruixes>5||n<50||n>=1000)
            return "";
        String explanada="";
        do{
            explanada=explanada(n);
        }while(quantesBruixes(explanada)!=bruixes);
        return explanada;
    }
    public static String explanada(int n){
        String caracters="()=";
        String cad="";
        for(int i=0;i<n;i++){
            cad+=caracters.charAt((int)(Math.random()*3));
        }
        return cad;
    }
    public static int quantesBruixes(String explanada){
        int contador=0;
        String cad="";
        String plantilla="=()=";
        for(int i=3;i<explanada.length();i++){
            cad="" + explanada.charAt(i-3) + explanada.charAt(i-2) + explanada.charAt(i-1) + explanada.charAt(i);
            if(cad.equals(plantilla)){
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        System.out.println(explanadaBruixes(69,3));
    }
}
