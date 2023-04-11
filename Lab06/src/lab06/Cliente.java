/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author 202212030045
 */
public class Cliente {
    private String cpf;
    private String nome;
    
    public Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
