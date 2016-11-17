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
public class Metodos {
    
    public int pedirNdigitos(){
        int numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero de digitos"));
        while(numDigitos <= 0){
            if (numDigitos <= 0)
                numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): "));
        }
        return numDigitos;
    }
    
}
