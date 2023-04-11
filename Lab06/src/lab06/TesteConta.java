/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;
import java.util.Scanner;
/**
 *
 * @author 202212030045
 */
public class TesteConta {
    public static void main(String[] args) {
        String nomec;
        String cpfc;
        int senhac;
        Double valor;
        int senhat;
        int n = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Seja bem vindo ao seu cadastro! ");
        System.out.println("Digite seu nome: ");
        nomec = scan.nextLine();
        System.out.println("Digite seu cpf: ");
        cpfc = scan.nextLine();
        
        Cliente clientec = new Cliente(cpfc, nomec);
        
        System.out.println("Digite uma senha: ");
        senhac = scan.nextInt();
        Conta contac = new Conta(senhac, 123 ,clientec, 1423123);
        
        System.out.println("Conta criada com sucesso! ");
        
        try { Thread.sleep (1000); } catch (InterruptedException ex) {}
        
        
        while(n != 0){
            System.out.println("O que você deseja? [1] Debitar Valor [2] Creditar Valor [3] Ver seu saldo [4] Ver número do seu Cartão [0] Encerrar o programa. ");
            n = scan.nextInt();
            if(n == 0){
                break;
            }
            else{
                if (n == 1){
                    System.out.println("Digite sua senha: ");
                    senhat = scan.nextInt();
                    System.out.println("Digite um valor");
                    valor = scan.nextDouble();
                    contac.debitaValor(valor, senhat);
                }
                if (n == 2){
                    System.out.println("Digite sua senha: ");
                    senhat = scan.nextInt();
                    System.out.println("Digite um valor");
                    valor = scan.nextDouble();
                    contac.creditaValor(valor, senhat);
                }
                if(n == 3){
                    System.out.println("" + contac.getSaldo());
                }
                if(n == 4){
                    System.out.println("" + contac.getCartão());
                }
            }
        }
        
        
}
    
}

