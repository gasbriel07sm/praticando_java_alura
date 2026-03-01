package poo_atributos_e_metodos.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Temperatura t = new Temperatura();

        System.out.print("Local: ");
        t.local = sc.nextLine();

        System.out.print("Temperatura atual: ");
        t.temperatura = sc.nextDouble();

        System.out.println();
        t.exibir();

        sc.close();
    }
}
