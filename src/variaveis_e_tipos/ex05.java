package variaveis_e_tipos;

public class ex05 {
    public static void main(String[] args) {

        String titulo = "O Pequeno Principe";
        String autor = "Antoine de Saint-Exupéry";
        int numeroPaginas = 96;
        double precoLivro = 39.90;
        char categoria = 'F';
        String categoriaDescricao = "";

        switch (categoria) {
            case 'F':
                categoriaDescricao = "Ficção";
                break;
            case 'N':
                categoriaDescricao = "Não Ficção";
                break;
            case 'T':
                categoriaDescricao = "Tecnologia";
                break;
            case 'H':
                categoriaDescricao = "História";
                break;
            default:
                System.out.println("Categoria não cadastrada!");
                break;
        }
        System.out.printf("Livro cadastrado: %s, de %s. Ele possui %d páginas, custa R$ %.2f e pertence à categoria %s.", titulo, autor, numeroPaginas, precoLivro, categoriaDescricao);
    }
}
