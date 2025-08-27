/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.frutas;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class Frutas {
        public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);
   
try {

    System.out.println("Digite um número de 1 a 3:");
int numero = scanner.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("Maçã");
                break;
            case 2:
                System.out.println("Banana");
                break;
            case 3:
                System.out.println("Laranja");
                break;
            default:
                System.out.println("Fruta inválida");
        }
        
} catch(Exception e){
    System.out.print ("Valor inválido");
}finally{
    System.out.print ("\n Obrigado por usar nosso programa");
        
        scanner.close();
    }
        }}