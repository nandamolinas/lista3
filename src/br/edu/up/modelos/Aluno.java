package br.edu.up.modelos;

public class Aluno {
    public void executar() {
        String Aluno = "Pedro Machado";
        System.out.println(Aluno);

        Double nota1 = 7.1;
        Double nota2 = 5.0;
        Double nota3 = 8.8;

        System.out.println("Resultado das notas " + ((nota1 + nota2 + nota3) / 3));
    }

}
