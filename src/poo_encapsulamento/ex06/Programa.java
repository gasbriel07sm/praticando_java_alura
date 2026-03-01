package poo_encapsulamento.ex06;

public class Programa {
    public static void main(String[] args) {

        Banco conta = new Banco("Ana");
        conta.depositar(1000.00);
        conta.sacar(800.00);
        conta.exibirSaldo();
    }
}
