package poo_atributos_e_metodos.ex06;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cadastro c = new Cadastro();

        System.out.print("Nome: ");
        c.nome = sc.nextLine();

        System.out.print("Cargo atual: ");
        c.cargo = sc.nextLine();

        System.out.print("Novo cargo: ");
        String novoCargo = sc.nextLine();

        System.out.print("Nível de acesso: ");
        c.nivelAcesso = sc.nextInt();

        System.out.print("Novo nível de acesso: ");
        int novoNivelAcesso = sc.nextInt();

        System.out.println();
        System.out.println("---- ANTES DA ATUALIZAÇÃO ----");
        c.exibir();

        c.atualizarDados(novoCargo, novoNivelAcesso);

        System.out.println("---- DEPOIS DA ATUALIZAÇÃO ----");
        c.exibir();

        sc.close();
    }
}
