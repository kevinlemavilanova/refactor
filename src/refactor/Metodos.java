/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactor;

import javax.swing.JOptionPane;
import static refactor.Refactor.p;

/**
 *
 * @author klemavilanova
 */
public class Metodos {

    public int pedirNdigitos() {
        int numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero de digitos"));
        while (numDigitos <= 0) {
            if (numDigitos <= 0) {
                numDigitos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): "));
            }
        }
        return numDigitos;
    }

    public int calcDigitos(int i) {
        int ndigitos = 0;
        int contador = 0;
        int divisionEntera = i;

        while (divisionEntera != 0) {
            divisionEntera /= 10;
            contador++;
        }
        ndigitos = contador;

        return ndigitos;
    }

    public int calcLimite(int i) {
        int limite = (i - 1) / 2;
        if (limite % 2 == 0) {
            limite--;
        }
        return limite;
    }

    public void calcPrimo(int i, int limite) {
        int contador1 = 0;
        int i1 = 1;
        while (i1 <= limite) {
            if (i % i1 == 0) {
                contador1++;
            }
            i1 += 2;
            if (contador1 == 2) {
                i1 = limite + 1;
            }
        }
        if (contador1 == 1) {
            p = true;
        }
    }

    public void esPrimo(int i) {
        if (i < 4) {
            p = true;
        } else if (i % 2 == 0) {
            p = false;
        } else {
            this.calcPrimo(i, this.calcLimite(i));
        }
        if (p == true) {
            System.out.println(i);
        }
    }
}
