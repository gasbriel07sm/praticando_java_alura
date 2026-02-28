package variaveis_e_tipos;

public class ex08 {
    public static void main(String[] args) {

        double taxaCambio = 5.25;
        double valorReais = 451.50;
        double valorDolares = valorReais / taxaCambio;

        System.out.printf("O valor em dólares é: U$ %.2f%n", valorDolares);
    }
}
