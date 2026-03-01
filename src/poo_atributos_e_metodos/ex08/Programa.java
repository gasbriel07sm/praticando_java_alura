package poo_atributos_e_metodos.ex08;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estoque e = new Estoque();

        System.out.print("Nome: ");
        e.nome = sc.nextLine();

        System.out.print("Quantidade: ");
        e.quantidade = sc.nextInt();

        e.subtrair(3);
        e.subtrair(8);
    }
}
