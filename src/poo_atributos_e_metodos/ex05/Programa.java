package poo_atributos_e_metodos.ex05;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Notas n = new Notas();

        System.out.print("Nome: ");
        n.nome = sc.nextLine();

        System.out.print("Nota 1: ");
        n.nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        n.nota2 = sc.nextDouble();

        double media = n.calcularMedia();

        System.out.printf("Média: %.2f%n", media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        }
        else {
            System.out.println("Situação: Reprovado");
        }

        sc.close();
    }
}
