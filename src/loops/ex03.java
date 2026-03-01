package loops;

public class ex03 {
    public static void main(String[] args) {

        int somaPar = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somaPar += i;
            }
        }

        System.out.println("A soma dos números pares de 1 a 100 é " + somaPar);
    }
}
