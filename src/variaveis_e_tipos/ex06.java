package variaveis_e_tipos;

public class ex06 {
    public static void main(String[] args) {

        double preco = 150.00;
        String categoria;

        if (preco <= 50.00) {
            categoria = "Econômico";
        }
        else if (preco > 50.00 && preco <= 200.00) {
            categoria = "Intermediário";
        }
        else {
            categoria = "Premium";
        }

        System.out.println("Categoria do produto: " + categoria);
    }
}
