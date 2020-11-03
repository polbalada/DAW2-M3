//AUTOR: Pol
import java.util.Arrays;
public class Ex22 {
    static int[] suma_vectors(int[] v1, int[] v2){
        int [] v = new int[v1.length+v2.length];
        int m=0;
        for (int i=0;i<v1.length;i++){
            v[m]=v1[i];
            m++;
        }
        for (int n=0;n<v2.length;n++){
            v[m]=v2[n];
            m++;
        }
        return v;
    }
    public static void main(String[] args) {
        int [] v1={1,3,2,5,20,69};
        int [] v2={1,420,69};
        System.out.println(Arrays.toString(suma_vectors(v1,v2)));
    }

}
