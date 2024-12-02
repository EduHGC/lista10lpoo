package lpoolistaexceptionq5;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 Você foi contratado para desenvolver o sistema de um banco. Modele a classe “ContaCorrente” utilizando 
		 os conceitos de abstração e encapsulamento. Crie a exceção checada SaldoInsuficienteException e lance 
		 essa exceção sempre que alguém tentar sacar um valor maior que o saldo disponível na conta. Após modelar 
		 a classe ContaCorrente e a exceção SaldoInsuficienteException siga os seguintes passos:
		 */
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
//		Ler do usuário um número de conta e saldo inicial
		System.out.println("Digite o número da conta:");
		String numeroConta = leitor.nextLine();
		System.out.println("Digite o valor inicial:");
		double deposito = leitor.nextDouble();
		
//		Instanciar um objeto ContaCorrente com o número e saldo informado no passo anterior
		ContaCorrente conta = new ContaCorrente(numeroConta, deposito);
		
//		Pedir que o usuário digite o valor de 10 saques na conta
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("Digite o valor do saque:");
				double saque = leitor.nextDouble();
				conta.saque(saque);
			}
		}catch (SaldoInsuficienteException e){
			System.out.println(e.getMessage());
			System.out.println("Saldo atual: R$" + String.format("%.2f", conta.getSaldo()) );
		}finally {
			leitor.close();
		}
	}

}
