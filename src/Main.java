import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===[Criação de conta]===");
        System.out.println("Nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.println("Número da gência: ");
        String agencia = sc.nextLine();
        System.out.println("Número da conta: ");
        int numero = sc.nextInt();
        System.out.println("Saldo da conta: ");
        double saldo = sc.nextDouble();
        ContaTerminal novaConta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        sc.close();

        System.out.println(novaConta.toString());
    }
}
