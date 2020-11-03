//AUTOR: Pol
import java.util.Arrays;
public class Ex21 {
    public static int[] gira_vector(int[] v){
        int aux;
        for (int n=0, m=v.length-1; n<v.length/2 ;n++,m--){
            aux=v[n];
            v[n]=v[m];
            v[m]=aux;
        }
        return v;
        
    }
    public static void main(String[] args) {
        int [] v={1,3,2,5,20,69};
        System.out.println(Arrays.toString(gira_vector(v)));
    }

}