package poo_encapsulamento.ex03;

public class Programa {
    public static void main(String[] args) {

        String nome = "Mouse";
        double preco = 59.90;

        Produto p = new Produto(nome, preco);

        System.out.println(p);
    }
}
