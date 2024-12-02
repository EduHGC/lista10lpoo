package lpoolistaexceptionq1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Faça um programa em JAVA que leia do usuário um nome e um número. Utilize um dos métodos da classe 
		  String para obter a letra do nome que se localiza na posição do número informado. 
		  Por exemplo: caso o usuário digite “José” e “2”, o programa deve imprimir na tela “s”, que 
		  corresponde ao caractere na posição dois, considerando que o primeiro caractere tem posição zero. 
		  Faça o tratamento de exceção para quando o usuário informar um número inválido, o programa mostrar a 
		  mensagem “Posição Inválida”. Por exemplo, se o usuário digitar a posição “10” para o nome “José”.*/
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o nome:");
		String nome = leitor.nextLine();
		System.out.println("Digite a posição da letra:");
		int indice = leitor.nextInt();
		
		letra(nome, indice);
		
		leitor.close();
	}
	
	public static void letra(String nome, int indice){
		try {
			char caracter = nome.charAt(indice);
			System.out.println(caracter);
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("O indice digitado está fora do tamanho da String.");
		}
	}

}
