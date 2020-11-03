//AUTOR: Pol
public class Ex17 {
    public static int min(int v[]){
        int [] vaux=java.util.Arrays.copyOf(v,v.length);
        java.util.Arrays.sort(vaux);
        return vaux[0];
    }
    public static void main(String[] args) {
        int [] v={1,3,2,5,20,69};
        System.out.println(min(v));
    }

}
