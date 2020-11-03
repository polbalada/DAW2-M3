//AUTOR: Pol
public class Ex20 {
    public static double max_sort(double v[]){
        double [] vaux=java.util.Arrays.copyOf(v,v.length);
        java.util.Arrays.sort(vaux);
        return vaux[vaux.length-1];
    }
    public static double max(double v[]){
        double max=v[0];
        for(int i=1;i<v.length;i++){
            if (v[i]>max)
                max=v[i];
        }
        return max;
    }
    
    public static void main(String[] args) {
        double [] v=new double[1000000];
        for (int i=0;i<1000000;i++){
            v[i]=Math.random();
        }
        long tempsMs= System.currentTimeMillis();
        double x=max(v);
        System.out.println("Major-> " + x + "Temps-> " + (System.currentTimeMillis()-tempsMs));
        tempsMs= System.currentTimeMillis();
        x=max_sort(v);
        System.out.println("Major-> " + x + "Temps-> " + (System.currentTimeMillis()-tempsMs));

    }

}
