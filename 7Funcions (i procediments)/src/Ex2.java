//AUTOR: Pol
import java.util.*;
public class Ex2 {
    public static void permuta(int v[]){
        int aux=v[0];
        v[0]=v[1];
        v[1]=aux;
    }
    public static void main(String[] args) {
        int v[]={10,20};
        System.out.println(java.util.Arrays.toString(v));
        permuta(v);
        System.out.println(java.util.Arrays.toString(v));
    }

}
