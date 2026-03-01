package poo_encapsulamento.ex09;

public class Alunos {

    private String nome;
    private int pontos;
    private int nivel;

    public Alunos(String nome) {
        this.nome = nome;
    }

    public void ganharPontos(int pontos) {
        this.pontos += pontos;
    }

    public void exibirStatus() {
        nivel = ((int) (pontos / 100)) + 1;
        System.out.println(
                "Nome: " + nome + "\n" +
                "Pontos: " + pontos + "\n" +
                "Nível: " + nivel
        );
    }
}
