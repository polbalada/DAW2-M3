//AUTOR: Pol
public class Ex9 {
    public static String explanada(int n){
        String caracters="()=";
        String cad="";
        for(int i=0;i<n;i++){
            cad+=caracters.charAt((int)(Math.random()*3));
        }
        return cad;
    }
    public static void main(String[] args) {
        System.out.println(explanada(5));
    }
}
