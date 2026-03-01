package condicionais;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();

        if (valor >= 100) {
            double desconto = 10;
            System.out.println("Valor de " + desconto + "% aplicado");
            double novoValor = valor * (1 - desconto/100);
            System.out.printf("Novo valor: %.2f%n", novoValor);
        }
        else {
            System.out.println("Nenhum desconto aplicado");
            System.out.printf("Valor total: %.2f%n", valor);
        }

        sc.close();
    }
}
