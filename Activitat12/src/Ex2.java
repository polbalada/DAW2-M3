//AUTOR: Pol
public class Ex2 {
    static int major3 (int a, int b, int c){
        if (a>=b && a>=c)
            return a;
        else if(b>=a && b>=c)
            return b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println(major3(1,3,1));
    }

}
