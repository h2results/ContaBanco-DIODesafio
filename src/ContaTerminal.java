import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta");
        int numero =  sc.nextInt();
        System.out.println("Digite o número da Agência");
        String texto = sc.nextLine();
        System.out.println("Digite o nome do Cliente");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo do Cliente");
        double saldo = sc.nextDouble();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + texto +
                ", conta " + numero + " e seu saldo atual é de " + saldo);
    }
}
