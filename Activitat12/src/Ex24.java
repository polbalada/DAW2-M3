//AUTOR: Pol
public class Ex24 {
    public static int posicio(int [] v, int x){
        for (int i=0;i<v.length;i++)
            if (v[i]==x)
                return i; 
        return -1;
    }
    public static void main(String[] args) {
        int [] v={1,4,20,69};
        System.out.println(posicio(v,69));
    }

}
