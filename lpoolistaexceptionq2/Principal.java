package lpoolistaexceptionq2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*Faça um programa em JAVA que leia a idade de 10 pessoas e armazene em um ArrayList. Em seguida, 
		  leia um número do usuário e remova da lista a idade localizada na posição informada. Por exemplo, 
		  se o usuário informar o número “4”, a idade armazenada na posição quatro da lista deve ser removida. 
		  Utilize um dos métodos da classe ArrayList para remover um elemento da lista. Faça o tratamento de exceção 
		  para quando o usuário informar um número inválido, o programa mostrar a mensagem “Posição Inválida”. 
		  Por exemplo, se o usuário digitar a posição “30”. 
		*/
		Scanner leitor = new Scanner(System.in);
		ArrayList<Integer> idades = new ArrayList<>();
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digita a idade: ");
			int idade = leitor.nextInt();
			idades.add(idade);
		}
		
		try {
			System.out.println("Digite o indice da idade para ser removida: ");
			int indice = leitor.nextInt();
			idades.remove(indice);
			System.out.println("Idade removida.");
		}catch (Exception e){
			//e.printStackTrace();
			System.out.println("O indice digitado está fora do tamanho do ArrayList.");
		}
		
		System.out.println(idades);
		
		leitor.close();
	}

}
