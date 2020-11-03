//AUTOR: Pol
public class Ex11 {
    public static String triangle (int a, int b, int c){
        if(a==b && b==c){
            return "Equilàter";
        }else if(a==b ||b==c||a==c){
            return "Isòsceles";
        }else if(a!=b && b!=c && a!=c){
            return "Escalè";
        }else{
            return "No es un triangle";
        }
    }
    public static void main(String[] args) {
        System.out.println(triangle(2,2,2));
    }
}
