/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classificadorfaixaetaria;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class ClassificadorFaixaEtaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        int FaixaEtaria;
        
        // Determinar o código da faixa etária usando if else
        if (idade >= 0 && idade <= 12) {
            FaixaEtaria = 1;
        } else if (idade >= 13 && idade <= 17) {
            FaixaEtaria = 2;
        } else if (idade >= 18 && idade <= 59) {
            FaixaEtaria = 3;
        } else if (idade >= 60) {
            FaixaEtaria = 4;
        } else {
            FaixaEtaria = 0; // Código para idade inválida
        }
        
        // Usar o case para exibir a faixa correspondente
        switch (FaixaEtaria) {
            case 1:
                System.out.println("Criança (0-12 anos)");
                break;
            case 2:
                System.out.println("Adolescente (13-17 anos)");
                break;
            case 3:
                System.out.println("Adulto (18-59 anos)");
                break;
            case 4:
                System.out.println("Idoso (60+ anos)");
                break;
            default:
                System.out.println("Idade inválida! Digite uma idade coerente.");
        }
        
        scanner.close();
      } catch (Exception e) {
            System.out.println("Idade inválida, digite números inteiros!");
        } finally {
            scanner.close();
        }
    }
}