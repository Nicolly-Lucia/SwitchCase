/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atendimentobancario;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class AtendimentoBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        double saldo = 1000.00;
        
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("Opções disponíveis:");
        System.out.println("1 Consultar o seu saldo");
        System.out.println("2 Sacar o seu dinheiro");
        System.out.println("3 Depositar o seu dinheiro");
        System.out.println("4 Encerrar o atendimento");
        
        System.out.print("Digite o número da opção  que deseja: ");
        int opcao = scanner.nextInt();
        
        switch (opcao) {
            case 1:
                System.out.println("Seu saldo atual é: R$ " + saldo);
                break;
                
            case 2:
                System.out.print("Digite o valor para sacar: R$ ");
                double valorSaque = scanner.nextDouble();
                
                if (valorSaque > saldo) {
                    System.out.println("Você possui um saldo insuficiente.");
                } else {
                    saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso.");
                    System.out.println("Novo saldo: R$ " + saldo);
                }
                break;
                
            case 3:
                System.out.print("Digite um valor para depositar: R$ ");
                double valorDeposito = scanner.nextDouble();
                
                saldo += valorDeposito;
                System.out.println("Depósito realizado com sucesso.");
                System.out.println("Novo saldo: R$ " + saldo);
                break;
                
            case 4:
                System.out.println("Atendimento encerrado. Obrigado pela preferência!");
                break;
                
            default:
                System.out.println("Erro inesperado ocorrido, selecione opção válida.");
        }
        
        scanner.close();
              } catch (Exception e) {
            System.out.println("Opção inválida, digite números válidos.");
        } finally {
            scanner.close();
        }
    }
}
