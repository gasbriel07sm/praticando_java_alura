package poo_atributos_e_metodos.ex02;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Livro l = new Livro();

        System.out.print("Titulo: ");
        l.titulo = sc.nextLine();

        System.out.print("Autor: ");
        l.autor = sc.nextLine();

        System.out.print("Páginas: ");
        l.paginas = sc.nextInt();

        System.out.println();
        System.out.println(l);

        sc.close();
    }
}
