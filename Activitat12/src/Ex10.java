//AUTOR: Pol
public class Ex10 {
    public static boolean hiHaBruixa(String cad){
        return (cad.contains("=()="));
    }
    public static String explanada(int n){
        String caracters="()=";
        String cad="";
        for(int i=0;i<n;i++){
            cad+=caracters.charAt((int)(Math.random()*3));
        }
        return cad;
    }
    public static String explanadaBruixa(){
        String cad;
        do{
            cad=explanada((int)(Math.random()*(100-10+1)+10));
        }while (!hiHaBruixa(cad));
        return cad;
            
    }
    public static void main(String[] args) {
        System.out.println(explanadaBruixa());
    }

}
