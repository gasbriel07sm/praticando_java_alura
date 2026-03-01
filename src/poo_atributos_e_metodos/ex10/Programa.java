package poo_atributos_e_metodos.ex10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Compras c1 = new Compras();
        Compras c2 = new Compras();

        c1.nome = "Teclado";
        c1.preco = 120.0;
        c1.quantidade = 1;

        c2.nome = "Mouse";
        c2.preco = 60.0;
        c2.quantidade = 2;

        List<Compras> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);

        double soma = 0;
        for (Compras c : lista) {
            soma += c.valorTotal();
        }

        System.out.printf("Valor total da compra: R$ %.2f%n", soma);

        sc.close();
    }
}
