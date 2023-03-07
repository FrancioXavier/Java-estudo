import java.util.Scanner;

public class ex11 {
    public void contas(double num1, double num2){
        //SOMA
        double soma = num1 + num2;
        System.out.println("\n" + num1 + " + " + num2 + " = " + soma);

        //MULTIPLICAÇÂO
        double multi = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + multi);

        //SUBTRAÇÃO
        double sub = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + sub);

        //DIVISÃO
        double div = num1/num2;
        System.out.println(num1 + " / " + num2 + " = " + div);

        //DIVISÃO INTEIRA
        double resto = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + resto); 

    }
    public static void main(String[] args) {
        ex11 metodos = new ex11();
        Scanner ler = new Scanner(System.in);
        double num1, num2 = 0;

        System.out.println("Digite um valor qualquer: ");
        num1 = ler.nextDouble();

        System.out.println("Digite outro valor qualquer: ");
        num2 = ler.nextDouble();
        ler.close();

        metodos.contas(num1, num2);
    }
}
