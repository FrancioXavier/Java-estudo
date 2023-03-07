package exerciciosAula1;
import java.util.Scanner;
//Questão

/*Criar um programa em Java que efetue o cálculo da quantidade de litros de
combustível gastos em uma viagem, sabendo-se que o carro faz 12km com um
litro. Deverão ser fornecidos o tempo gasto na viagem a velocidade média. O
programa deverá apresentar a distância percorrida e a quantidade de litros de
combustível utilizados na viagem. */

public class ex09{
    public double distancia(int temp, double velocidade){
        double dist = (temp * velocidade);
        return dist;
    }

    public double combustivel(double distancia){
        double combustivel = distancia/12;
        return combustivel;
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ex09 metodos = new ex09();
        int tempo = 0;
        double distancia_percorrida, combustivel_gasto, velocidade = 0;

        System.out.println("Digite o tempo gasto na viagem (em horas): ");
        tempo = ler.nextInt();

        System.out.println("Digite a velocidade média (em km/h): ");
        velocidade = ler.nextDouble();
        ler.close();

        distancia_percorrida = metodos.distancia(tempo, velocidade);
        System.out.println("A distancia percorrida foi: " + distancia_percorrida + " KM");

        combustivel_gasto = metodos.combustivel(distancia_percorrida);
        System.out.println("O combustivel gasto foi: " + combustivel_gasto + " litros");

    }
}
