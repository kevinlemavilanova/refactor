/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactor;

import javax.swing.JOptionPane;

/**
 *
 * @author klemavilanova
 */
public class Refactor {

    public static boolean p = false;

    public static void main(String arg[]) {
        Metodos function = new Metodos();
        int numDigitos = function.pedirNdigitos();

        for (int i = 1; i <= 99999; i++) {
            if (function.calcDigitos(i) == numDigitos) {
                function.esPrimo(i);
            }
        }
    }

}
