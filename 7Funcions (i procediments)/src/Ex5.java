//AUTOR: Pol
public class Ex5 {
    public static int dau (){
        return (int)(Math.random()*(6-1+1)+1);
    }
    public static int dos_daus(){
        return dau() + dau();
    }
    public static void main(String[] args) {
        System.out.println(dos_daus());
    }

}
