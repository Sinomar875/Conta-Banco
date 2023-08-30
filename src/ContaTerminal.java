import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o Numero da sua Conta:");
            int Conta = scanner.nextInt();

        System.out.println("Digite a sua Agencia:");
            String Agencia = scanner.next();

        System.out.println("Digite seu Saldo:");
            Float Saldo = scanner.nextFloat();

        System.out.println("Digite seu Nome:");
            String Nome = scanner.next();

            System.out.println("Ola " + Nome + ", obrigado por criar uma conta em nosso banco, sua agencia e " + Agencia + ", conta " + Conta + " e seu saldo " + Saldo + " ja esta disponivel para saque.");

    }
}
