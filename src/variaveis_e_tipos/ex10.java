package variaveis_e_tipos;

public class ex10 {
    public static void main(String[] args) {

        double consumoMedio = 12.5; // O carro faz 12,5 km por litro
        double capacidadeTanque = 50; // O tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // Há 20 litros disponíveis
        double distanciaViagem = 200; // A viagem planejada tem 200 km

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        System.out.printf("Autonomia máxima : %.2f%n", autonomiaMaxima);
        double autonomiaAtual = consumoMedio * combustivelAtual;
        System.out.printf("Autonomia atual : %.2f%n", autonomiaAtual);

        double litrosNecessario = distanciaViagem / consumoMedio;

        if (litrosNecessario <= combustivelAtual) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer. ");
        }
        else {
            System.out.println("Você não conseguirá completar a viagem sem precisar abastecer. ");
        }
    }
}
