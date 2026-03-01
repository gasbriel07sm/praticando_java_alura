package poo_encapsulamento.ex09;

public class Programa {
    public static void main(String[] args) {

        Alunos aluno = new Alunos("Fernanda");

        aluno.ganharPontos(120);
        aluno.exibirStatus();
    }
}
