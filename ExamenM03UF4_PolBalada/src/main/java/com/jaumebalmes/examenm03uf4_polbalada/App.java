package com.jaumebalmes.examenm03uf4_polbalada;
//AUTOR: Pol
public class App {
    public static void main(String[] args) {
        Persona [] p = new Persona[6];
        //String nom, int edat, boolean autoritzacio, boolean viuResidencia
        
        //nom  edat  autoritzacio viuResidencia  anticosos
        p[0] = new Pacient("Antonia",80,true,true, true);
        //nom  edat  autoritzacio viuResidencia
        p[1] = new Pacient("Bel",90,true,true);
        //nom  edat  autoritzacio llocTreball
        p[2] = new Sanitari("Carles",30,true,1);//SocioSanitari
        //nom  edat  autoritzacio llocTreball
        p[3] = new Sanitari("Dana",60,true,2);//Doctora
        //nom  edat  autoritzacio viuResidencia grauDependencia
        p[4] = new Pacient("Enric",40,false,false,3);
        p[5] = new Pacient("Pol",20,false,false,true);
        
        for(int i=0;i<p.length;i++)
            System.out.println(p[i].toString());
        
        String grup1="";
        String grup2="";
        String grup3="";
        String grup4="";
        String grup0="";
        for(int i=0;i<p.length;i++){
            switch(p[i].getGrup()){
                case 1:
                    grup1+=p[i].getNom() + " ";
                    break;
                case 2:
                    grup2+=p[i].getNom() + " ";
                    break;
                case 3:
                    grup3+=p[i].getNom() + " ";
                    break;
                case 4:
                    grup4+=p[i].getNom() + " ";
                    break;
                default:
                    grup0+=p[i].getNom() + " ";
            }
        }
        System.out.println("Grup 0 " + grup0);
        System.out.println("Grup 1 " + grup1);
        System.out.println("Grup 2 " + grup2);
        System.out.println("Grup 3 " + grup3);
        System.out.println("Grup 4 " + grup4);
            
        
        System.out.println("S'han inscrit:" + Persona.contador);
        System.out.println("Persones vacunables:" + Persona.contadorVacunes);
        System.out.println("Persones amb anticosos:" + Persona.contadorAnticosos);
        int antiVacunes=Persona.contador - Persona.contadorVacunes;
        System.out.println("Persones sense autoritzacio:" + antiVacunes);
        
        p[0].setAutoritzacio(false);
        grup1="";
        grup2="";
        grup3="";
        grup4="";
        grup0="";
        for(int i=0;i<p.length;i++){
            switch(p[i].getGrup()){
                case 1:
                    grup1+=p[i].getNom() + " ";
                    break;
                case 2:
                    grup2+=p[i].getNom() + " ";
                    break;
                case 3:
                    grup3+=p[i].getNom() + " ";
                    break;
                case 4:
                    grup4+=p[i].getNom() + " ";
                    break;
                default:
                    grup0+=p[i].getNom() + " ";
            }
        }
        System.out.println("Grup 0 " + grup0);
        System.out.println("Grup 1 " + grup1);
        System.out.println("Grup 2 " + grup2);
        System.out.println("Grup 3 " + grup3);
        System.out.println("Grup 4 " + grup4);
    }

}
