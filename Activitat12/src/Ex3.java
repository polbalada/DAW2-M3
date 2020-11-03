//AUTOR: Pol
public class Ex3 {
    static int major4 (int a, int b, int c, int d){
        if(a>=b && a>=c && a>=d)
            return a;
        else if(b>=a && b>=c && b>=d)
            return b;
        else if(c>=a && c>=b && c>=d)
            return c;
        return d;
    }
    public static void main(String[] args) {
        System.out.println(major4(1,5,1,4));
    }

}
