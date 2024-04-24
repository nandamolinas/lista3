package br.edu.up.modelos;

import java.util.Scanner;

public class Exercicio4 {
    public void executar() {
        try (Scanner Valor = new Scanner(System.in)) {
            double Real = 5.16;

            System.out.println("Insira a quantidade de Dolares que esta posuindo: ");
            int Dolares = Valor.nextInt();

            System.out.println("Voce esta posuindo esta quantidade de Reais: " + (Dolares * Real));
        }

    }

}
