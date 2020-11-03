
import java.util.Arrays;

//AUTOR: Pol
public class Ex26 {
    public static long[] vec_primers(int num_primers){
        int contador=0;
        long [] v= new long[num_primers];
        int i=2;
        int n=2;
        while (contador<num_primers){
            if (n%i==0){
                v[contador]=i;
                contador++
            }
            i++;
        }
        return v;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(vec_primers(5)));
    }

}
