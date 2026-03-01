package condicionais;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade do doador: ");
        int idade = sc.nextInt();

        System.out.print("Digite o peso do doador (em kg): ");
        double peso = sc.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("O doador é compatível");
        }
        else {
            System.out.println("O doador não é compatível.");
            System.out.println("Motivo: Deve ter entre 18 e 65 anos. ");
        }
        sc.close();
    }
}
