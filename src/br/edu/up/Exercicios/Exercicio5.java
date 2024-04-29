package br.edu.up.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
    public void executar() {
        try (Scanner Quantidade = new Scanner(System.in)) {

            int ValorPrestacoes = 5;

            System.out.println("Digita o Valor total da compra: ");
            double Valor = Quantidade.nextInt();

            System.out.println("Resultado Das Prestacoes: " + (Valor / ValorPrestacoes));
        }
    }
}
