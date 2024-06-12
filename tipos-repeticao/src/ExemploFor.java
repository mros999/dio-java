import java.util.Locale;
import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos carneirinhos pularam: ");
        int totalCarneirinhos = scanner.nextInt();
        
        for(int carneirinhos = 1; carneirinhos <=totalCarneirinhos; carneirinhos++){
            System.out.println(carneirinhos +" carneirinhos");
        }

        System.out.println("Joaozinho dormiu!");
        scanner.close();
    }
    
}
