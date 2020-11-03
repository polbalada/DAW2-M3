/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.cursacavallsdaw1;

import java.util.Scanner;

/**
 *
 * @author pere
 */
public class JocCursaCavalls implements JocInterface {
    final public static int META = 25;
    
    private boolean guanyat = false;

    Cavall c1=new Cavall("USER");
    Cavall c2=new Cavall("CPU");
    
    @Override
    public void iniciarJoc() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix el nom ");
        String nomCavall = entrada.next();
        
        c1 = new Cavall(nomCavall);
        System.out.println(c1.nomNen);
        System.out.println(c2.nomNen);
    }

    @Override
    public void jugada() {
        Dau d1 = new Dau();
        c1.endavant(d1.tirada());
        
        Dau d2 = new Dau();
        c2.endavant(d2.tirada());
        
    }

    @Override
    public boolean esFinal() {
        return (c1.posicio==META)||(c2.posicio==META);
        
    }

    @Override
    public void finalJoc() {
        if(c1.posicio==META){
            System.out.println("Ets un crack! Has encertat el ");
        } else {
            System.out.println("Mala sort!!! Has perdut!");
        }
    }
    
}
