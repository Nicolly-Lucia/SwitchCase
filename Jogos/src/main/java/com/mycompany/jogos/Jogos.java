/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogos;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class Jogos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 5:");
        int numero = scanner.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("Minecraft");
                break;
            case 2:
                System.out.println("FIFA");
                break;
            case 3:
                System.out.println("Fortnite");
                break;
            case 4:
                System.out.println("Call of Duty");
                break;
            case 5:
                System.out.println("The Sims");
                break;
            default:
                System.out.println("Jogo não encontrado");
        }
        
        scanner.close();
    }
}
