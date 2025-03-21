import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextInt();

        System.out.println("[1] Soma\n[2] Subtracao\n[3] Multiplicacao\n[4] Divisao\nDigite a operacao");
        int operacao = scanner.nextInt();

        switch (operacao){
            case 1:
                Somar(num1, num2);
                break;
            case 2:
                Subtrair(num1, num2);
                break;
            case 3:
                Multiplicar(num1, num2);
                break;
            case 4:
                Dividir(num1, num2);
                break;
            default:
                System.out.println("Operacao invalida");
                break;
        }
    }

    static void Somar(int num1, int num2){
        int resultado = num1+num2;
        System.out.println(num1 + " + " + num2 + " = " + resultado);
    }

    static void Subtrair(int num1, int num2){
        int resultado = num1-num2;
        System.out.println(num1 + " - " + num2 + " = " + resultado);
    }

    static void Multiplicar(int num1, int num2){
        int resultado = num1*num2;
        System.out.println(num1 + " x " + num2 + " = " + resultado);
    }

    static void Dividir(int num1, int num2){
        int resultado = num1/num2;
        System.out.println(num1 + " ÷ " + num2 + " = " + resultado);
    }
}