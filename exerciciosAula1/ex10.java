import java.util.Scanner;

//QUESTÂO

/*Escreva um programa em Java para exibir a tabela de multiplicação de um
determinado número inteiro. */

public class ex10 {
    public void tabuada(int num){
        for(int i = 1; i < 11; i++){
            int res = i * num;
            System.out.println(num + " x " + i + " = " + res);
        }
    }
    public static void main(String[] args) {
        ex10 metodos = new ex10();
        Scanner ler = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um valor inteiro que queira saber a tabuada");
        num = ler.nextInt();
        ler.close();

        metodos.tabuada(num);

    }
}
