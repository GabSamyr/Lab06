/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author 202212030045
 */
public class Cartao {
        private int numero;
        private Cliente titular;

public Cartao(int numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
    }

public int getNumero() {
        return this.numero;
    }

public Cliente getTitular() {
        return this.titular;
    }

public void setTitular(Cliente titular) {
        this.titular = titular;
    }


}

