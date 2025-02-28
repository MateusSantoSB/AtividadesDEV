import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string para inverter: ");
        String palavra = scanner.nextLine();
        scanner.close();

        char[] caracteres = palavra.toCharArray();
        int comeco = 0;
        int fim = caracteres.length - 1;

        while (comeco < fim) {
            char temp = caracteres[comeco];
            caracteres[comeco] = caracteres[fim];
            caracteres[fim] = temp;
            comeco++;
            fim--;
        }

        String invertida = new String(caracteres);
        System.out.println("A String "+palavra+" invertida fica assim:");
        System.out.println("------> "+ invertida+" <------");
    }
}

