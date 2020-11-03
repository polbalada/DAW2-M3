package introprocesing;
//AUTOR: Pol
public class IntroProcesing {
    
    public static void main(String[] args) {
        Shape s1=new Shape();
        Circle c1=new Circle();
        Shape c2=new Circle();
        Shape s2=new Shape();
        
        System.out.println(s1);
        System.out.println(s1.area());
        System.out.println(c1);
        System.out.println(c1.area());
        System.out.println(c2);
        System.out.println(s2);
    }

}
