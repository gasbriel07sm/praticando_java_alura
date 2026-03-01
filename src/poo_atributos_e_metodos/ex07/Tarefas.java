package poo_atributos_e_metodos.ex07;

public class Tarefas {

    public String descricao;
    public boolean concluida;

    public void exibir() {
        if (concluida) {
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }
}
