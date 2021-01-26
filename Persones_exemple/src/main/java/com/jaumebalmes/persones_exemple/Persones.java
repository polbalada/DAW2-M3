package com.jaumebalmes.persones_exemple;
//AUTOR: Pol

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Persones {
    public static ArrayList<Persona> persones = new ArrayList<Persona>();
    
//    final public static int MAX_PERSONES = 100;
//    static private Persona[] persones = new Persona[MAX_PERSONES];
//    static private int nPersones = 0;
    
    static void afegirPersona(Persona p) throws PersonaDuplicadaExcepcion{
        if (persones.contains(p)) {
            throw new PersonaDuplicadaExcepcion(p.getNom() + "Persona duplicada");
        }
        persones.add(p);
//        boolean error=false;
//        int i=0;
//        while(!error && i<nPersones){
//            if(p.getDni().equals(persones[i].getDni())){
//                error=true;
//                System.out.println("ERROR " + p.getNom());
//            }
//            i++;
//        }
//        if(!error){
//            persones[nPersones] = p;
//            nPersones++;
//        }
        
    }
    
    static void mostrarTots() {
        for (Persona p : persones) {
            System.out.println(p);
        }
//        for(int n=0;n<nPersones;n++)
//            System.out.println(persones[n]);
    }
    
    static void ordenarComparable(){
        Collections.sort(persones);
//        Arrays.sort(persones,0,nPersones);
    }
    
    static void ordenarData(){
        Collections.sort(persones, new OrdenaPerData());
//       try {
//           Arrays.sort(persones, Comparator.comparing(Persona::getDataNaixement).thenComparing(Persona::getCognom1));
//       } catch (Exception e) {
//       }
   }
    
}
class OrdenaPerData implements Comparator<Persona> {
    @Override
    public int compare(Persona t, Persona t1) {
        return t.getDataNaixement().compareTo(t1.getDataNaixement());
    }
}