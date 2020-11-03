//AUTOR: Pol
public class Ex16 {
    public static double max(double v[]){
        double [] vaux=java.util.Arrays.copyOf(v,v.length);
        java.util.Arrays.sort(vaux);
        return vaux[vaux.length-1];
    }
    public static void main(String[] args) {
        double [] v={1,3,2,5,20,69};
        System.out.println(max(v));
    }

}
