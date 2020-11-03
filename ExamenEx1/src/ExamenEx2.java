/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pol
 */
class Montes{
    private String monte;
    private int altura;
    private String fecha;
    private int intentos;
    private boolean conOxigeno;

    public void setMonte(String monte) {
        this.monte = monte;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setConOxigeno(boolean conOxigeno) {
        this.conOxigeno = conOxigeno;
    }

    public String getMonte() {
        return monte;
    }

    public int getAltura() {
        return altura;
    }

    public String getFecha() {
        return fecha;
    }

    public int getIntentos() {
        return intentos;
    }

    public boolean isConOxigeno() {
        return conOxigeno;
    }

    public Montes(String monte) {
        this.monte = monte;
    }
    
    public Montes(String monte, int altura, String fecha, int intentos, boolean conOxigeno) {
        this.monte = monte;
        this.altura = altura;
        this.fecha = fecha;
        this.intentos = intentos;
        this.conOxigeno = conOxigeno;
    }

    @Override
    public String toString() {
        return "\tNombre de la montaña \t" + monte + "\n\tNumero de intentos realizados:\t" + intentos + "\n\tSe coronó la cima:\tSi\t en fecha:\t " + fecha + "\n\tSe necesitó oxígeno en la escalada:\t" +conOxigeno;
    }
}

public class ExamenEx2 {

    public static void main(String[] args) {
        int num=5;
        ProvaMontes[] escalados = new Montes(num);
        escalados[0] = new ProvaMontes("Everest", 8848, "", 1, false);
        escalados[1] = new ProvaMontes("K2", 8848, "26/7/2004", 2, true);
        escalados[2] = new ProvaMontes("Kangche", 8848, "26/7/2004", 1, true);
        escalados[3] = new ProvaMontes("Annapurna", 8848, "26/7/2004", 1, false);
        escalados[4] = new ProvaMontes("Cho Oyu", 8848, "", 1, false);
//        Montes MyObj = new Montes("aa",0,"aa",0,true);
//        System.out.println(MyObj.toString());
    }

    private static class ProvaMontes {

        public ProvaMontes() {
        }

        private ProvaMontes(String everest, int i, String string, int i0, boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
        
}
