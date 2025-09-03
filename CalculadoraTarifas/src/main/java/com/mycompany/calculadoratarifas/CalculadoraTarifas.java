/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoratarifas;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;

public class CalculadoraTarifas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Tipos de transporte:");
            System.out.println("1 Ônibus urbano (R$ 4,40)");
            System.out.println("2 Metrô (R$ 5,00)");
            System.out.println("3 Trem intermunicipal (R$ 6,50)");
            System.out.println("4 Ônibus rodoviário (R$ 12,00)");
            
            System.out.print("Digite o número do tipo de transporte: ");
            int tipoTransporte = scanner.nextInt();
            
            System.out.print("Digite a quantidade de bilhetes: ");
            int quantidade = scanner.nextInt();
            
            double valorTotal = 0;
            String tipo = "";
            
            switch (tipoTransporte) {
                case 1:
                    valorTotal = quantidade * 4.40;
                    tipo = "Ônibus urbano";
                    break;
                case 2:
                    valorTotal = quantidade * 5.00;
                    tipo = "Metrô";
                    break;
                case 3:
                    valorTotal = quantidade * 6.50;
                    tipo = "Trem intermunicipal";
                    break;
                case 4:
                    valorTotal = quantidade * 12.00;
                    tipo = "Ônibus rodoviário";
                    break;
                default:
                    System.out.println("Tipo de transporte inválido!");
                    return;
            }
            
            System.out.println("\nResultado da compra de bilhetes");
            System.out.println("Tipo de transporte: " + tipo);
            System.out.println("Quantidade de bilhetes: " + quantidade);
            System.out.printf("Valor total: R$ %.2f%n", valorTotal);
            
      
        } catch (Exception e) {
            System.out.println("Digite números válidos!");
        } finally {
            scanner.close();
        }
    }
}