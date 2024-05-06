import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main (String [] args) {
        //Conhecer e importar a classe Scanner
        Scanner scannerUsuario = new Scanner(System.in).useLocale(Locale.US);

        String exemploNumAgencia = "(Ex.: ***-*)";
        //Exibir as mensagens para nosso usuario
        System.out.println("Para começamos, por favor, informe o número da Agência: " + exemploNumAgencia);
        String numeroDAgencia = scannerUsuario.next();

        System.out.println("Digite seu primeiro nome: ");
        String primeiroNomeUsuario = scannerUsuario.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeUsuario = scannerUsuario.next();

        System.out.println("Informe o número de sua conta: ");
        int numeroConta = scannerUsuario.nextInt();

        System.out.println("O quanto gostaria de depositar: ");
        double saldoConta = scannerUsuario.nextDouble();

        //Obter pela class Scanner os valores pelo terminal
        System.out.println("Olá " + primeiroNomeUsuario + " " + sobrenomeUsuario + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroDAgencia + ", conta número " + numeroConta + ". Seu saldo de " + saldoConta + " " + "já está disponível para saque.");
    }
}