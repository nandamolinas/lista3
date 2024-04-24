package br.edu.up.modelos;

import java.util.Scanner;

public class Exercicio6 {
    public void executar() {
        try(Scanner Preco = new Scanner(System.in)){
            
            System.out.println("Digite o porcentagem que deseja que seja aplicado para o custo de venda(%): ");
            double Porcentagem = Preco.nextInt();

            System.out.println("Digite o Valor de costo do produto: ");
            double Valor = Preco.nextInt();

            double Venda = Valor / (100);

            System.out.println("O Resultado de Custo de vendas sera: " + (Venda * Porcentagem));
            
        }

       
    }
}
