package condicionais;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia da semana em letras minúsculas: ");
        String diaDaSemana = sc.nextLine();


        switch (diaDaSemana) {
            case "segunda", "terca", "quarta", "quinta", "sexta":
                System.out.println(diaDaSemana + " é dia útil");
                break;
            case "sabado", "domingo":
                System.out.println(diaDaSemana + " é final de semana");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }

        sc.close();
    }
}
