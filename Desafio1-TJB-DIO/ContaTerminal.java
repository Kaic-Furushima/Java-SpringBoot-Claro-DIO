import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o saldo: ");
        Double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("\nOlá " + nome +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero +
                " e seu saldo " + saldo +
                " já está disponível para saque!");
    }
}
