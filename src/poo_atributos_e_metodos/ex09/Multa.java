package poo_atributos_e_metodos.ex09;

public class Multa {

    public String titulo;
    public int diasDeAtraso;

    public void exibirDetalhes() {
        double valorMulta = 2.5 * diasDeAtraso;
        System.out.printf("Livro: %s |" +
                " Multa por %d dias de atraso: R$ %.2f%n", titulo, diasDeAtraso, valorMulta);
    }
}
