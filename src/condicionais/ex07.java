package condicionais;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo: ");
        double valor = sc.nextDouble();

        if (valor >= 1000 && valor <= 5000) {
            System.out.printf("O valor %.2f, está dentro do intervalo permitido para empréstimo. ", valor);
        }
        else {
            System.out.printf("O valor %.2f, não está dentro do intervalo permitido para empréstimo. ", valor);
        }
    }
}
