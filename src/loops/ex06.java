package loops;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";

        for (int tentativas = 3; tentativas > 0; tentativas--) {
            System.out.print("Digite sua senha: ");
            String senha = sc.nextLine();

            if (senha.equals(SENHA_CORRETA)) {
                System.out.println("Senha correta! Acesso concedido!");
                break;
            } else if (tentativas > 1) {
                System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
            } else {
                System.out.println("Conta bloqueada temporariamente.");
            }
        }
        sc.close();
    }

}
