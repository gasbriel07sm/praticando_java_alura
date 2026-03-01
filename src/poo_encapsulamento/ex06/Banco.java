package poo_encapsulamento.ex06;

public class Banco {

    private String titular;
    private double saldo;

    public Banco(String titular) {
        this.titular = titular;}

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        }
        else {
            saldo -= valor;
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + titular + ": " + String.format("%.2f", saldo));
    }

}
