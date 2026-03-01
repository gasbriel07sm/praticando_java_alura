package poo_encapsulamento.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Contatos> contatos = new ArrayList<>();

        contatos.add(new Contatos("João Silva", "(11) 99999-0000"));
        contatos.add(new Contatos("Luana Santos", "(21) 98888-0000"));
        contatos.add(new Contatos("Pedro Oliveira", "(31) 97777-0000"));

        int i = 1;
        for (Contatos c : contatos) {
            System.out.println(i + ". " + c);
            i++;
        }

    }
}
