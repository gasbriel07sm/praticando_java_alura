package poo_encapsulamento.ex04;

public class Senha {

    private String senha;

    public Senha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha, String novaSenha) {
        if (senha.equals(this.senha)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        }
        else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}
