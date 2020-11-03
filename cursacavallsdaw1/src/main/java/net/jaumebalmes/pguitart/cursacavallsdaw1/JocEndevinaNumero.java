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
public class JocEndevinaNumero implements JocInterface {
    final public static int MAX_NUMERO = 10;
    final public static int MAX_JUGADES = 5;    
    
    private int numeroSecret;
    private int nJugades = 0;
    private boolean guanyat = false;
    

    @Override
    public void iniciarJoc() {
        numeroSecret = (int) (Math.random() * MAX_NUMERO) + 1;
    }

    @Override
    public void jugada() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Entra un numero ?");
        int num = entrada.nextInt();
        guanyat = num == numeroSecret;
        nJugades++;
    }

    @Override
    public boolean esFinal() {
        return guanyat || nJugades >= MAX_JUGADES;
    }

    @Override
    public void finalJoc() {
        if(guanyat){
            System.out.println("Ets un crack! Has encertat el " + numeroSecret);
        } else {
            System.out.println("Mala sort!!! Has perdut!");
        }
    }
    
    
}
