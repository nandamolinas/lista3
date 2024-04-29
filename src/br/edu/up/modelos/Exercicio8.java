package br.edu.up.modelos;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        try (Scanner Notas = new Scanner(System.in)){

             System.out.println("Digite o Nome do Aluno: ");
            String Aluno = Notas.nextLine();

            System.out.println("Digite a Primeira nota: ");
            int PrimeiraN = Notas.nextInt();

            System.out.println("Digite a Segunda nota: ");
            int SegundaN = Notas.nextInt();

            System.out.println("Digite a Segunda nota: ");
            int TerceiraN = Notas.nextInt();

            double Media = (PrimeiraN + SegundaN + TerceiraN) / (3.0);

            String Resultado = "x";

            if (Media >= 7) {
                Resultado = "Aprovado!";
            } else if (Media <= 5){
                Resultado = "Reprovado!";
            } else {
                Resultado = "Recuperacao";
            }

            System.out.println("Resultado das notas: " + (Aluno) + (Resultado));

        }

    }
}
