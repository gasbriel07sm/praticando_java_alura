package poo_encapsulamento.ex07;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        Filmes matrix = new Filmes("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);

        System.out.printf("Média de avaliações para %s: %.2f\n",
                matrix.getTitulo(), matrix.calcularMedia());

    }
}
