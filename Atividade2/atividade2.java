import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero para verificar: ");
        int numero = scanner.nextInt();
        scanner.close();

        int x = 5 * numero * numero + 4;
        int y = 5 * numero * numero - 4;

        if (ehQuadradoPerfeito(x) || ehQuadradoPerfeito(y)) {
            System.out.println(numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence a sequência de Fibonacci.");
        }
    }

    public static boolean ehQuadradoPerfeito(int num) {
        int raiz = (int) Math.sqrt(num);
        return raiz * raiz == num;
    }
}
