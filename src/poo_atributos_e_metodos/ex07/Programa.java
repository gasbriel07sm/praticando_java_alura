package poo_atributos_e_metodos.ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Tarefas> t = new ArrayList<>();

        Tarefas t1 = new Tarefas();
        t1.descricao = "Estudar Java";
        t1.concluida = false;
        t.add(t1);

        Tarefas t2 = new Tarefas();
        t2.descricao = "Fazer exercícios";
        t2.concluida = true;
        t.add(t2);

        for (Tarefas tarefa : t) {
            tarefa.exibir();
        }
    }
}
