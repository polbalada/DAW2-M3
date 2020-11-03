//AUTOR: Pol
public class Ex15 {
    public static int max(int v[]){
        int [] vaux=java.util.Arrays.copyOf(v,v.length);
        java.util.Arrays.sort(vaux);
        return vaux[vaux.length-1];
    }
    public static void main(String[] args) {
        int [] v={1,3,2,5,20,69};
        System.out.println(max(v));
    }

}
