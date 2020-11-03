//AUTOR: Pol
public class Ex8 {
    public static boolean hiHaBruixa(String cad){
        return (cad.contains("=()="));
    }
    public static void main(String[] args) {
        System.out.println(hiHaBruixa("=)(=)()=(=(=)=(="));
    }

}
