import java.util.Locale;
import java.util.Scanner;

public class ExemploBreakContinue {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos carneirinhos pularam: ");
        int totalCarneirinhos = scanner.nextInt();

        for(int carneirinhos = 1; carneirinhos <=totalCarneirinhos; carneirinhos++){
            if(carneirinhos ==3)
                continue; //break para parar codigo

            System.out.println(carneirinhos +" carneirinhos");
        }

        scanner.close();
    }
}
