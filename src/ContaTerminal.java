import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Numero da sua Conta:");
            int Numero = scanner.nextInt();

        System.out.println("Digite a sua Agencia:");
            String Agencia = scanner.next();

        System.out.println("Digite seu Saldo:");
            Float Saldo = scanner.nextFloat();

        System.out.println("Digite seu Nome:");
            String Nome = scanner.next();

    }
}
