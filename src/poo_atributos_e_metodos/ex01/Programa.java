package poo_atributos_e_metodos.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Produto prod = new Produto();

        System.out.print("Nome: ");
        prod.nome = sc.nextLine();

        System.out.print("Preço: ");
        prod.preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        prod.quantidade = sc.nextInt();

        System.out.println();
        System.out.println(prod);

        sc.close();
    }
}
