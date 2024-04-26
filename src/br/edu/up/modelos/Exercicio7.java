package br.edu.up.modelos;

import java.util.Scanner;

public class Exercicio7 {
    public void executar() {
        try (Scanner Valor = new Scanner(System.in)) {

            double Impostos = 0.45;
            double PorcentagemDistribuidor = 0.28;

            System.out.println("Insira o custo de Fabrica do carro: ");
            double Custo = Valor.nextInt();

            double CustodeFabrica = Custo * (Impostos);
            double CustoDistribuidor = (Custo + CustodeFabrica) * (PorcentagemDistribuidor);

            System.out.println("O valor do Custo ao consumidor seria: " + (Custo + CustoDistribuidor));
        }

    }
}
