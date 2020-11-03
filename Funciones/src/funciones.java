public class funciones {
    static long fact (long x){
        for (long i=x-1;i>1;i--)
            x*=i;
        return x;
    }
    static long fact2(long x){
        if (x<2)
            return 1;
        x*=fact2(x-1);
        return x;
    }
    static String vuelta(String x){
        String result="";
        for (int i=x.length()-1;i>=0;i--)
            result = result + x.charAt(i);
        return result;
    }
    static String vuelta2(String x){
        String result="";
        for (int i=0;i<x.length();i++)
            result = x.charAt(i)+result;
        return result;
    }
    //static String vuelta3(String x){
        //if (n=x.length())
        //int n=0;
        //return x.charAt(n)+vuelta3(n+1);
    //}
    static double fibonacci(double x){
        if (x<2)
            return 1;
        return fibonacci(x-1)+fibonacci(x-2);
    }
    
    public static void main(String[] args) {
        int num=8;
        System.out.println(fact(num));
        System.out.println(fact2(num));
        System.out.println(vuelta("HOLA"));
        System.out.println(vuelta2("HOLA"));
        System.out.println(fibonacci(8));
    }
}
