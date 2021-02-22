//AUTOR: Pol
public class App {
    public static void main(String[] args) {
        Navegador.anar("balmes1.net");
        Navegador.anar("balmes2.net");
        Navegador.anar("balmes5.net");
        Interes.afegir();
        Interes.afegir();
        Navegador.anar("balmes3.net");
        Navegador.anar("balmes4.net");
        Interes.afegir();
        
        Navegador.anar("balmes10.net");
        Navegador.anar("balmes12.net");
        Navegador.anar("balmes13.net");
        Navegador.anar("balmes14.net");
        System.out.println("Prova enrere endavant");
        System.out.println(Barra.getUrl()); //balmes14.net
        Visitats.enrere();
        System.out.println(Barra.getUrl());//balmes13.net
        Visitats.enrere();
        System.out.println(Barra.getUrl());//balmes12.net
        Visitats.endevant();
        System.out.println(Barra.getUrl());//balmes13.net
        
        System.out.println("Historial");
        Historial.mostrar();
        System.out.println("Interes");
        Interes.mostrar();
    }

}
