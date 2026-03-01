package loops;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N ; i++) {
            System.out.println("Subindo o degrau " + i);
        }

        System.out.println("Você chegou ao topo!");

        sc.close();
    }
}
