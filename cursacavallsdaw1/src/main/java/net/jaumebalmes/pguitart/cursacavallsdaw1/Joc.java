/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jaumebalmes.pguitart.cursacavallsdaw1;

/**
 *
 * @author pere
 */
public class Joc {

    public static void main(String[] args) {
        JocInterface joc = new JocCursaCavalls();

        joc.iniciarJoc();
        while (!joc.esFinal()) {
            joc.jugada();
        }
        joc.finalJoc();
    }

}
