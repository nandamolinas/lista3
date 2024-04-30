package br.edu.up.Exercicios;

import java.util.Scanner;

public class Exercicio16 {
    public void executar() {
        try (Scanner scanner = new Scanner(System.in)){

            double SalarioMinimo = 1100; 
            int TotalMenorTres = 0;
            int TotalTresADez = 0;
            int TotalDezAVinte = 0;
            int TotalOutros = 0;
            int TotalFuncionarios = 584;
    
            for (int i = 0; i < TotalFuncionarios; i++) {
                System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
                double Salario = scanner.nextDouble();
    
                double Reajuste;
                if (Salario < 3 * SalarioMinimo) {
                    Reajuste = Salario * (0.5);
                    TotalMenorTres++;
                } else if (Salario >= 3 * SalarioMinimo && Salario <= 10 * SalarioMinimo) {
                    Reajuste = Salario * (0.2);
                    TotalTresADez++;
                } else if (Salario > 10 * SalarioMinimo && Salario <= 20 * SalarioMinimo) {
                    Reajuste = Salario * (0.15);
                    TotalDezAVinte++;
                } else {
                    Reajuste = Salario * (0.1);
                    TotalOutros++;
                }
    
                double salarioReajustado = Salario + Reajuste;
                System.out.println("Salário antes do reajuste: R$" + Salario);
                System.out.println("Salário após o reajuste: R$" + salarioReajustado);
            }
    
            System.out.println("\nTotal de funcionários que ganham menos de 3 salários mínimos: " + TotalMenorTres);
            System.out.println("Total de funcionários que ganham entre 3 e 10 salários mínimos: " + TotalTresADez);
            System.out.println("Total de funcionários que ganham entre 10 e 20 salários mínimos: " + TotalDezAVinte);
            System.out.println("Total de funcionários que ganham mais de 20 salários mínimos: " + TotalOutros);
        }


       
    }
}
