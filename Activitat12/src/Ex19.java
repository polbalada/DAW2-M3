//AUTOR: Pol
public class Ex19 {
    public static double mitja(double [] v){
        double suma=0;
        for(int i=0;i<v.length;i++)
            suma+=v[i];
        return suma/(v.length+1);
    }
    public static void main(String[] args) {
        double [] v={1,3,2,5,20,69};
        System.out.println(mitja(v));
    }

}
