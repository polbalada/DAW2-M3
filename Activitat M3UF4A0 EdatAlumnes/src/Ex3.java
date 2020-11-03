//AUTOR: Pol
class Alumne{
    int edat;

    public Alumne() {
        edat=(int)(Math.random()*(40-17+1)+17);
    }
    
}
public class Ex3 {
    //PARAMETROS AQUI
    public static void main(String[] args) {
        Alumne myObj1 = new Alumne();
        Alumne myObj2 = new Alumne();
        Alumne myObj3 = new Alumne();
        
        System.out.println(myObj1.edat);
        System.out.println(myObj2.edat);
        System.out.println(myObj3.edat);
    }

}
