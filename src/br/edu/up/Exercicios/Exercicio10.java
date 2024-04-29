package br.edu.up.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public void executar() {
        try (Scanner Idade = new Scanner(System.in)){

            System.out.println("Digite um numero de pessoas: ");
            int NumeroPessoas = Idade.nextInt();

            for(int i = 0; i < NumeroPessoas; i++){
                System.out.println("Digite as idades de cada uma: ");
                int IdadePessoas = Idade.nextInt();

                if(IdadePessoas >= 18){
                    System.out.println("Maior de idade!");
                }else{
                    System.out.println("Menor de idade!");
                }
                
                
            }

            

        }
        

    }
}
