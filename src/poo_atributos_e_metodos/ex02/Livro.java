package poo_atributos_e_metodos.ex02;

public class Livro {

    public String titulo;
    public String autor;
    public int paginas;

    @Override
    public String toString() {
        return
              titulo
              + " de "
              + autor
              + " com "
              + paginas
              + " páginas";
    }
}
