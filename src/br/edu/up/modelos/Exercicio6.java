package br.edu.up.modelos;

import java.util.Scanner;

public class Exercicio6 {
    public void executar() {
<<<<<<< HEAD
        try (Scanner Preco = new Scanner(System.in)) {

=======
        try(Scanner Preco = new Scanner(System.in)){
            
>>>>>>> e966f16e447bda8af5f90c21c1f23c51e2745386
            System.out.println("Digite o porcentagem que deseja que seja aplicado para o custo de venda(%): ");
            double Porcentagem = Preco.nextInt();

            System.out.println("Digite o Valor de costo do produto: ");
            double Valor = Preco.nextInt();

            double Venda = Valor / (100);

            System.out.println("O Resultado de Custo de vendas sera: " + (Venda * Porcentagem));
<<<<<<< HEAD

        }

=======
            
        }

       
>>>>>>> e966f16e447bda8af5f90c21c1f23c51e2745386
    }
}
