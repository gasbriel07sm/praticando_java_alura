package poo_atributos_e_metodos.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta c = new Conta();

        System.out.print("Saldo: ");
        c.saldo = sc.nextDouble();

        c.exibirSaldo();
        c.zerarSaldo();
        c.exibirSaldo();

        sc.close();
    }
}
