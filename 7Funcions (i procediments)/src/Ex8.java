//AUTOR: Pol
import java.util.*;
public class Ex8 {
    public static int[] ordena_tres(int n1, int n2, int n3){
        int[] v = {n1,n2,n3};
        java.util.Arrays.sort(v);
        return v;
    }
    public static void main(String[] args) {
        System.out.println("Vector ordenat " + java.util.Arrays.toString(ordena_tres(75,10,30)));
    }

}
