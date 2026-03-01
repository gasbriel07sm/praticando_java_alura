package condicionais;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código de acesso: ");
        int codAcesso = sc.nextInt();
        System.out.print("Digite o nível de permissão: ");
        int nivelAcesso = sc.nextInt();

        if (codAcesso == 2023 && nivelAcesso == 1 || nivelAcesso == 2 || nivelAcesso == 3) {
            System.out.println("Acesso permitido. Bem-vido ao sistema!");
        }
        else {
            System.out.println("Acesso negado.");
        }
    }
}
