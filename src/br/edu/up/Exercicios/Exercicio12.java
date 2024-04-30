package br.edu.up.Exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public void executar(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int AnoA = 0;
        double TotalGeral = 0;
        

        char Continuar = 'S';

        while (Continuar == 'S'){

            System.out.println("Digite o Ano do veiculo: ");
            int Ano = leitor.nextInt();

            double Desconto;

            if(Ano <= 2000){
                Desconto = 0.12;
                AnoA++;
            } else{
                Desconto = 0.07;
            }


            System.out.println("Digite o preco do carro: ");
            double Valor = leitor.nextDouble();


            double ValorDesconto = Valor * Desconto;
            double ValorFinal = Valor - ValorDesconto;

            System.out.println("Desconto: " + ValorDesconto);
            System.out.println("Valor a ser pago: " + ValorFinal);
            
            

            System.out.print("Deseja continuar calculando desconto (S/N): ");
            Continuar = leitor.next().charAt(0);
             
        }

        System.out.println("Total de carros ate o 2000: " + AnoA);
        System.out.println("Total geral: " + TotalGeral);




    }
}
