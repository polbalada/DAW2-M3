//AUTOR: Pol
class Personatge {
    private String nom;
    private int x;
    private int y;
    private int diners;
    private String motxilla;
    
    //MOVIMNETS------------------------------------------------------------
    public void movDreta(){
        x++;
    }
    public void movEsquerra(){
        x--;
    }
    public void movAmunt(){
        y++;
    }
    public void movAvall(){
        y--;
    }
    //FI MOVIMNETS------------------------------------------------------------
    
    //NOM------------------------------------------------------------
    public String getNom(){
        return nom;
    }
    //FI NOM------------------------------------------------------------

    //MOTXILLA------------------------------------------------------------
    public String getMotxilla() {
        return motxilla;
    }

    public void setMotxilla(String motxilla) {
        this.motxilla = motxilla;
    }
    //FI MOTXILLA------------------------------------------------------------
    
    //DINERS------------------------------------------------------------
    public void augmentDiners(int quantitat) {
        diners+=quantitat;
    }
    public void quantitatDiners(int quantitat){
        diners-=quantitat;
    }
    public void deixarDiners(int quantitat, Personatge p){
        this.diners-=quantitat;
        p.diners+=quantitat;
    }
    public int getDiners() {
        return diners;
    }
    //FI DINERS------------------------------------------------------------
    
    //Constructor------------------------------------------------------------
    public Personatge(String nom, int x, int y, int diners, String motxilla) {
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.diners = diners;
        this.motxilla = motxilla;
    }    
    //FI Constructor------------------------------------------------------------

    @Override
    public String toString() {
        return "Personatge{" + "nom=" + nom + ", x=" + x + ", y=" + y + ", diners=" + diners + ", motxilla=" + motxilla + '}';
    }
    
}

public class A13 {
    public static void main(String[] args) {
        Personatge indiana = new Personatge("Indiana",0,0,50,"Bruixola");
        Personatge pepito = new Personatge("Pepito",1,3,30,"");
        
        System.out.println(indiana);
        System.out.println(pepito);
        System.out.println();
        
        pepito.movEsquerra();
        pepito.movAvall();
        pepito.movAvall();
        pepito.movAvall();
        
        int auxDiners=(pepito.getDiners()/2);
        pepito.deixarDiners(auxDiners, indiana);
        //pepito.quantitatDiners(auxDiners);
        //indiana.augmentDiners(auxDiners);
        
        String auxMotxilla=indiana.getMotxilla();
        indiana.setMotxilla("");
        pepito.setMotxilla(auxMotxilla);
        
        System.out.println(indiana);
        System.out.println(pepito);
        System.out.println();
        
        indiana.movAmunt();
        indiana.movAmunt();
        indiana.movAmunt();
        indiana.movAmunt();
        indiana.movAmunt();
        indiana.movDreta();
        indiana.movDreta();
        indiana.movDreta();
        indiana.movDreta();
        indiana.movDreta();
        indiana.setMotxilla("Mapa");
        
        System.out.println(indiana);
        System.out.println(pepito);
        System.out.println();
    }

}
