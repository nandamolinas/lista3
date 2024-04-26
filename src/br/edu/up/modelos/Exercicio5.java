package br.edu.up.modelos;

import java.util.Scanner;

public class Exercicio5 {
<<<<<<< HEAD
    public void executar() {
        try (Scanner Quantidade = new Scanner(System.in)) {

            int ValorPrestacoes = 5;
=======

    public void executar() {
         try (Scanner Quantidade = new Scanner(System.in)) {

            int ValorPrestacoes = 5;
            
>>>>>>> e966f16e447bda8af5f90c21c1f23c51e2745386

            System.out.println("Digita o Valor total da compra: ");
            double Valor = Quantidade.nextInt();

<<<<<<< HEAD
            System.out.println("Resultado Das Prestacoes: " + (Valor / ValorPrestacoes));
=======
            System.out.println("Resultado Das Prestacoes: " +(Valor / ValorPrestacoes) );
>>>>>>> e966f16e447bda8af5f90c21c1f23c51e2745386
        }
    }
}
