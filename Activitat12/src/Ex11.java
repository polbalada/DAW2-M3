//AUTOR: Pol
public class Ex11 {
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
        System.out.println(quantesBruixes("(=)(=)()()(=)=)()()==)=()==()==()==()="));
    }

}
