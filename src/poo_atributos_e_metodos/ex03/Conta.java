package poo_atributos_e_metodos.ex03;

public class Conta {

    public double saldo;

    public void zerarSaldo() {
        saldo = 0.0;
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual = R$ " + String.format("%.2f", saldo));
    }
}
