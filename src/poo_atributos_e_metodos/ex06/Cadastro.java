package poo_atributos_e_metodos.ex06;

public class Cadastro {

    public String nome;
    public String cargo;
    public int nivelAcesso;

    public void atualizarDados(String cargo, int nivelAcesso){
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public void exibir(){
        System.out.println(
                "Nome: " + nome + "\n" +
                "Cargo: " + cargo + "\n" +
                "Nível de acesso: " + nivelAcesso + "\n"
        );
    }
}
