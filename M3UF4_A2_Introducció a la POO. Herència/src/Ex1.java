//AUTOR: Pol
import java.awt.Point;
public class Ex1 {
    static Point puntMitj(Point a, Point b){
        int x=(int)(a.getX()+b.getX())/2;
        int y=(int)(a.getY()+b.getY())/2;
        return new Point(x,y);
    }
    static Point puntMitj(Point a, Point b, Point c){
        int x=(int)(a.getX()+b.getX()+c.getX())/3;
        int y=(int)(a.getY()+b.getY()+c.getY())/3;
        return new Point(x,y);
    }
    
    static int distancia(Point a, Point b){
        return (int)a.distance(b);
    }
    static int distancia(Point a, Point b, Point c){
        return (int)a.distance(b);
    }
    
    public static void main(String[] args) {
        Point a = new Point();
        Point b = new Point(100,100);
        Point c = new Point(69,69);
        
        System.out.println("Punt Mitj a i b: "+puntMitj(a,b));
        System.out.println("Punt Mitj a, b i c: "+puntMitj(a,b,c));
        System.out.println("Distancia entre a i b: "+distancia(a,b));
        System.out.println("Distancia entre a, b i c: "+a.distance(b));
    }

}
