package poo_atributos_e_metodos.ex04;

public class Temperatura {

    public String local;
    public double temperatura;

    public void exibir() {
        System.out.printf(
                "Sensor do local: %s \n" +
                "Temperatura: %.1f ºC\n",
                local, temperatura
        );

        if (temperatura > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite");
        }
    }
}
