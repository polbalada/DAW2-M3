//AUTOR: Pol
public class Ex25 {
    public static int posicio(int [] v, int x){
        int contador=0;
        for (int i=0;i<v.length;i++)
            if (v[i]==x)
                contador++;
        return contador;
    }
    public static void main(String[] args) {
        int [] v={1,4,20,69,69,69};
        System.out.println(posicio(v,69));
    }

}
