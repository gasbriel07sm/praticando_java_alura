package condicionais;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double media = sc.nextDouble();

        if (media >= 7.0) {
            System.out.printf("O estudante teve a média %.1f e foi aprovado", media);
        }
        else if (media >= 5.0 && media < 7) {
            System.out.printf("O estudante teve a média %.1f e foi recuperação", media);

        }
        else if (media < 5 && media >= 0) {
            System.out.printf("O estudante teve a média %.1f e foi reprovado", media);

        }

        sc.close();
    }
}
