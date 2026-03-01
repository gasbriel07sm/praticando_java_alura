package poo_atributos_e_metodos.ex10;

public class Compras {

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotal() {
        return preco * quantidade;
    }
}
