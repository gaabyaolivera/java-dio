import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		
		System.out.println("Informe o seu nome: ");
		nomeCliente = ler.next();
		
		System.out.println("Informe o número da conta: ");
		numeroConta = ler.nextInt();
		
		System.out.println("Informe a agência: ");
		agencia = ler.next();
		
		System.out.println("Informe o saldo inicial da sua conta: ");
		saldo = ler.nextDouble();
		
		System.out.println("Olá "+ nomeCliente+ " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+ " conta "+ numeroConta+ " e seu saldo " + saldo + " já está disponível para saque.");
		
		
	}

}
