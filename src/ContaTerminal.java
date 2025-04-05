import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Solicita os dados da conta ao usuário
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita os dados da conta ao usuário
            System.out.print("Digite o número da Agência: ");
            int numeroAgencia = scanner.nextInt();
            
            System.out.print("Digite o número da Conta: ");
            int numeroConta = scanner.nextInt();
            
            scanner.nextLine(); // Limpar o buffer do scanner
            
            System.out.print("Digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();
            
            System.out.print("Digite o saldo da conta: ");
            double saldo = scanner.nextDouble();
            
            // Cria um objeto Cliente com o nome do cliente
            Cliente cliente = new Cliente();
            cliente.setNome(nomeCliente);
            
            // Cria um objeto ContaCorrente com os dados da conta
            Conta conta = new ContaCorrente(cliente);
            conta.agencia = numeroAgencia;
            conta.numeroConta = numeroConta;
            conta.saldo = saldo;
            
            // Exibe a mensagem formatada
            System.out.println("Olá " + conta.cliente.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numeroConta + " e seu saldo " + conta.saldo + " já está disponível para saque.");
        }
    }
}