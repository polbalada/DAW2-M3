//AUTOR: Pol
public class Ex4 {
    static int quantesVegades (String cad, char c){
        int contador=0;
        char x;
        for (int i=cad.length()-1;i>=0;i--){
            x=cad.charAt(i);
            if(x==c){
                contador++;
            } 
        }
        return contador;
    }
    public static void main(String[] args) {
        System.out.println(quantesVegades("caca",'c'));
    }

}
