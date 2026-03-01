package condicionais;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 123456;

        System.out.print("Digite a senha: ");
        int senhaDigitada = sc.nextInt();

        if (senhaDigitada == senha) {
            System.out.println("Acesso permitido");
        }
        else {
            System.out.printf("Acesso negado");
        }

        sc.close();
    }
}
