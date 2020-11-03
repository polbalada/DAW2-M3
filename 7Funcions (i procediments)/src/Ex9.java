//AUTOR: Pol
public class Ex9 {
    public static int len_num (int num){
        String s = Integer.toString(num);
        int l=s.length();
        return l;
    }
    public static void main(String[] args) {
        System.out.println(len_num(10000));
    }

}
