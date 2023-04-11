/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author 202212030045
 */
public class Conta {
    
    private int senha;
    private Cartao cartao;
    private int numero;
    private double saldo = 0;
    
    public Conta(int senha, int numConta, Cliente titular, int numCartao){
        this.senha = senha;
        this.numero = numConta;
        this.cartao = new Cartao(numCartao, titular);
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void creditaValor(double Valor, int Senha){
        if( senha == this.senha){
          this.saldo = this.saldo + Valor;  
        }
        else{
            System.out.println("Erro!");
            System.out.println("Senha incorreta");
        }
    }
    
    public void debitaValor(double Valor, int Senha){
        if(this.senha == Senha){
        if(this.saldo - Valor > 0){
        this.saldo = this.saldo - Valor;
        System.out.println("Sucesso!");
        }
        else{
            System.out.println("Erro");
        }
        }
        if(Senha != this.senha){
            System.out.println("Erro!");
            System.out.println("Senha incorreta!");
        } 
    } 
    
    
public void alteraCartao(int numeroDoCartao, Cliente titular) {
this.cartao = new Cartao(numeroDoCartao, titular);
}    
    public int getCartão(){ 
    return this.cartao.getNumero();
    }
}