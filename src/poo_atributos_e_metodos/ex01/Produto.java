package poo_atributos_e_metodos.ex01;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    @Override
    public String toString() {
        return
                "Produto = " + nome +
                "\nPreço = " + preco +
                "\nQuantidade em estoque = " + quantidade;
    }
}
