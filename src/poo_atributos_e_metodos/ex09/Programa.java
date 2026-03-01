package poo_atributos_e_metodos.ex09;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Multa m = new Multa();

        System.out.print("Titulo: ");
        m.titulo = sc.nextLine();

        System.out.print("Dias de atraso: ");
        m.diasDeAtraso = sc.nextInt();

        m.exibirDetalhes();
    }
}
