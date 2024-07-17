import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num;
        String agencia, nomCli;
        double saldo;
        System.out.println("Por favor, digite sua conta: ");
        num = s.nextInt();
        s.nextLine();
        System.out.println("Digite a sua agência: ");
        agencia= s.nextLine();
        System.out.println("Digite o seu nome: ");
        nomCli = s.nextLine();
        System.out.println("Digite o seu saldo: R$");
        saldo = s.nextDouble();
        System.out.println("Olá "+nomCli+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+num+" e seu saldo R$"+saldo+" já está disponível para saque.");        
    }
}
