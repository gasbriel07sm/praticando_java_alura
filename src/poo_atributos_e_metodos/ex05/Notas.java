package poo_atributos_e_metodos.ex05;

public class Notas {

    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }
}
