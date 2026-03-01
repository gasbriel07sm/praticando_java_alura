package poo_encapsulamento.ex05;

public class Bateria {

    private int nivelBateria;

    public Bateria() {
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        if (nivelBateria >= 0 && nivelBateria <= 100) {
            this.nivelBateria = nivelBateria;
        }
    }

    public void status() {
        if (nivelBateria <= 20) {
            System.out.println("Status: Bateria fraca");
        }
        else if (nivelBateria > 20 && nivelBateria < 80) {
            System.out.println("Status: Bateria ok");
        }
        else {
            System.out.println("Bateria cheia");
        }
    }
}
