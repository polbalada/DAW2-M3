//AUTOR: Pol
import java.util.Arrays;
public class Ex23 {
    public static int[] crea_vector (int min, int max, int num_valors){
        if (min>max){
            int aux=min;
            min=max;
            max=aux;
        }
        int [] v= new int[num_valors];
        for (int i=0;i<num_valors;i++)
            v[i]=(int)(Math.random()*(max-min+1)+min);
        return v;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(crea_vector(5,69,9)));
    }

}
