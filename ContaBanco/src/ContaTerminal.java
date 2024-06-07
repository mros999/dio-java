import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite numero de conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.next();

        System.out.println("Digite seu saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá "+ nome +  ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
