package br.edu.up.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
    public void executar() {
        try (Scanner Contador = new Scanner(System.in)){

            System.out.println("Digite 80 numeros: ");
            Contador.nextInt();

            int NumeroA = 0;

            for (int i = 0; i < 80; i++){
                int NumeroB = Contador.nextInt();

                if (NumeroB >= 10 && NumeroB <= 150)
                NumeroA++;
            }

            System.out.println("Numeros que estao no intervalo: " + NumeroA);
              
        
        }
    }
}
