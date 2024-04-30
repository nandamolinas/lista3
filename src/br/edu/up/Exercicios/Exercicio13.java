package br.edu.up.Exercicios;

import java.util.Scanner;

public class Exercicio13 {
 public void executar() {
       try (Scanner leitor = new Scanner(System.in)){

           int TotaldePessoasAptas = 0;
           int TotaldePessoasInaptas = 0;

           System.out.println("Digite um numero de pessoas: ");
           int NumPessoas = leitor.nextInt();
           leitor.nextLine();

           for(int i = 0; i < NumPessoas; i++){
            System.out.println("Digite o Nome de cada uma: ");
             leitor.nextLine();
            

            System.out.println("Digite a idade: ");
            int Idade = leitor.nextInt();
            leitor.nextLine();

            System.out.println("Digite o Sexo(Femenino/Masculino): ");
            String Sexo = leitor.nextLine();
            leitor.nextLine();

            System.out.println("Digite o estado de saude(Bom/Ruim): ");
            String Saude = leitor.nextLine();
            leitor.nextLine();

            boolean Apta = Sexo.equals("Masculino") && Idade >= 18 && Idade <= 45; Saude.equalsIgnoreCase("Boa");

            if (Apta ) {
                System.out.println("Apto para o servico militar obrigatorio: ");
                TotaldePessoasAptas++;
            } else {
                System.out.println("Inapto para o servico militar");
                TotaldePessoasInaptas++;
            }

            System.out.println("Total de pessoas aptas: " + TotaldePessoasAptas);

            System.out.println("Total de Pessoas inaptas: " + TotaldePessoasInaptas);
           }




       } 
 }
}
