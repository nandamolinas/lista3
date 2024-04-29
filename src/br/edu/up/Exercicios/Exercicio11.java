package br.edu.up.Exercicios;

import java.util.Scanner;

public class Exercicio11 {
public void executar() {
    Scanner leitor = new Scanner(System.in);
        
        
        int TotalHomem = 0;
        int TotalMulher = 0;

        for(int i = 0; i < 56; i++){
            System.out.println("Digite o Nome das pessoas: ");
            String Nome = leitor.nextLine(); 
            System.out.println("Digite o sexo das pessoas (homem sendo 1 e mulher sendo 0): ");
            int Sexo = leitor.nextInt();
            
            // Apenas para pular para a proxima linha
            leitor.nextLine(); 
            
            if (Sexo == 1) {
                System.out.println("Homem");
                System.out.println(Nome);
                TotalHomem++;
            } else if (Sexo == 0) {
                System.out.println("Mulher");
                System.out.println(Nome);
                TotalMulher++;
            } else{
                System.out.println("Numero invalido");
            }
        }

        System.out.println("Total de Homens e: " + TotalHomem + "Total de Mulheres e: " + TotalMulher);

   


}
}
