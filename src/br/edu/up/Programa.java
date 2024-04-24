package br.edu.up;

import br.edu.up.modelos.Aluno;
import br.edu.up.modelos.Exercicio2;
import br.edu.up.modelos.Exercicio3;
import br.edu.up.modelos.Exercicio4;
import br.edu.up.modelos.Exercicio5;


public class Programa {
        public static void main(String[] args) {
                Aluno Estudante = new Aluno();

                Estudante.executar();

                Exercicio3 Vendedor = new Exercicio3();

                Vendedor.executar();

                Exercicio2 Carro = new Exercicio2();

                Carro.executar();

                Exercicio4 Reais = new Exercicio4();

                Reais.executar();

                Exercicio5 ValorPrestacoes = new Exercicio5();

                ValorPrestacoes.executar();

        }

}
