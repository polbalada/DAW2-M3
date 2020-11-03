//AUTOR: Pol
public class Ex7 {
    public static String separa(String cad, String separador){
        String cadFinal="";
        for(int i=0;i<cad.length()-1;i++){
            cadFinal+=cad.charAt(i)+separador;
        }
        cadFinal+=cad.charAt(cad.length()-1);
        return cadFinal;
    }
    public static void main(String[] args) {
        System.out.println(separa("Hola", "--"));
    }

}
