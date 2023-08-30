import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Numero da sua Conta:");
            int Conta = scanner.nextInt();

        System.out.println("Digite a sua Agencia:");
            String Agencia = scanner.next();

        System.out.println("Digite seu Saldo:");
            Float Saldo = scanner.nextFloat();

        System.out.println("Digite seu Nome:");
            String Nome = scanner.next();

            System.out.println("Olá " + Nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Conta + " é seu saldo R$" + Saldo + " já esta disponivel para saque.");

        }
}
