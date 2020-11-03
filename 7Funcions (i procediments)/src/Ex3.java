//AUTOR: Pol
public class Ex3 {
    public static int aleatori (int n1, int n2){
        if (n1>n2){
            int aux=n1;
            n1=n2;
            n2=aux;
        }
        return (int)(Math.random()*(n2-n1+1)+n1);
    }
    public static void main(String[] args) {
        System.out.println(aleatori(10,20));
    }

}
