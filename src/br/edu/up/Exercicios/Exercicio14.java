package br.edu.up.Exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double SomaPrecoCusto = 0;
        double SomaPrecoVenda = 0;

        for (int i = 1; i <= 40; i++) {
            System.out.println("Produto " + i + ":");
            System.out.print("Preço de custo: R$");
            double precoCusto = scanner.nextDouble();

            System.out.print("Preço de venda: R$");
            double precoVenda = scanner.nextDouble();

            double lucro = precoVenda - precoCusto;
            String resultado = lucro > 0 ? "Lucro" : lucro < 0 ? "Prejuízo" : "Empate";

            System.out.println("Resultado para o Produto " + i + ": " + resultado);
            SomaPrecoCusto += precoCusto;
            SomaPrecoVenda += precoVenda;
        }

        double MediaPrecoCusto = SomaPrecoCusto / (40);
        double MediaPrecoVenda = SomaPrecoVenda / (40);

        System.out.println("\nMédia de preço de custo: R$" + MediaPrecoCusto);
        System.out.println("Média de preço de venda: R$" + MediaPrecoVenda);

        scanner.close();
    }
    
    
}