import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TratamenteDeExececoes {
    public static void main(String[] args) {

        try{
        
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        //imprimindo os dados obtidos
        System.out.println("Prazer " + nome + " " + sobrenome + " espero que esteja bem!");

        System.out.println("Seu sobrenome " + sobrenome + " é muito interessante");

        System.out.println("Você tem " + idade + " anos");

        System.out.println("E sua altura é " + altura + "m");

        }
        catch(InputMismatchException e){
            System.out.println("Os campos de idade e altura precisam ser numéricos e na padrão norte americano (Utilzar . ao invés de ,) ");
        }
    }
}
