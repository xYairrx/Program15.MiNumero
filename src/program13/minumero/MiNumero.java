/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program13.minumero;

/**
 *
 * @author Yair
 */
public class MiNumero {
    private int numero;

    public MiNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
     public void cambiaNumero(int num) {
        numero = num;
    }

    public int sumaNumero(int num) {
        numero = numero + num;
        return numero;
    }

    public int restaNumero(int num) {
        numero = numero - num;
        return numero;
    }

    public int getDoble() {
        return numero * 2;
    }

    public int getTriple() {
        return numero * 3;
    }

    public int getCuadruple() {
        return numero * 4;
    }
}
