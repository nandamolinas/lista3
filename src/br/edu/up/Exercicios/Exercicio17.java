package br.edu.up.Exercicios;

import java.util.Scanner;

public class Exercicio17 {
     public void executar() {
        try (Scanner leitor = new Scanner(System.in)){
            
            System.out.print("Digite o Nome do funcionario: ");
            String Nome = leitor.nextLine();
    
            System.out.print("Digite o salario do funcionario: ");
            double Salario = leitor.nextDouble();
    
            System.out.print("Digite o valor do salario minimo: ");
            double SalarioMinimo = leitor.nextDouble();
    
            double Reajuste;
            if (Salario < (3) * SalarioMinimo) {
                Reajuste = Salario * (0.5);
            } else if (Salario >= (3) * SalarioMinimo && Salario <= (10) * SalarioMinimo) {
                Reajuste = Salario * (0.2);
            } else if (Salario > (10) * SalarioMinimo && Salario <= (20) * SalarioMinimo) {
                Reajuste = Salario * (0.15);
            } else {
                Reajuste = Salario * (0.1);
            }
    
            double NovoSalario = Salario + Reajuste;
            double AumentoFolha = Reajuste;
    
            System.out.println("Nome do funcionario: " + Nome);
            System.out.println("Reajuste salarial: " + Reajuste);
            System.out.println("Novo salario reajustado: " + NovoSalario);
            System.out.println("Aumento de pagamento da empresa: " + AumentoFolha);
        }



    }
}
