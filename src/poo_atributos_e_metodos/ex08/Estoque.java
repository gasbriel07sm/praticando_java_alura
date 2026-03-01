package poo_atributos_e_metodos.ex08;

public class Estoque {

    public String nome;
    public int quantidade;

    public void subtrair(int quantidade){
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Venda realizada. Estoque restante de " + nome + ": " + quantidade);
        }
        else {
            System.out.println("Estqoue insufiente");
        }
    }
}
