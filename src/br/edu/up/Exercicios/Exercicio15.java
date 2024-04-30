package br.edu.up.Exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public void executar() {
        try(Scanner scanner = new Scanner(System.in)){

           double TotalDesconto = 0;
           double TotalPago = 0;
       
           while (true) {
               System.out.print("Digite o tipo de combustivel (alcool, gasolina, diesel) ou 0 para sair: ");
               String Combustivel = scanner.nextLine();
       
               if (Combustivel.equals("0")) {
                   break;
               }
       
               System.out.print("Digite o valor do veiculo: ");
               double ValorVeiculo = scanner.nextDouble();
               scanner.nextLine(); 
       
               double Desconto;
               switch (Combustivel) {
                   case "alcool":
                       Desconto = ValorVeiculo * (0.25);
                       break;
                   case "gasolina":
                       Desconto = ValorVeiculo * (0.21);
                       break;
                   case "diesel":
                       Desconto = ValorVeiculo * (0.14);
                       break;
                   default:
                       Desconto = 0;
                       break;
               }
       
               double ValorPago = ValorVeiculo - Desconto;
               System.out.println("Desconto: " + Desconto);
               System.out.println("Valor a ser pago: " + ValorPago);
       
               TotalDesconto += Desconto;
               TotalPago += ValorPago;
           }
       
           System.out.println("Total de desconto: " + TotalDesconto);
           System.out.println("Total pago pelos clientes: " + TotalPago);

       }


       
    }
}
