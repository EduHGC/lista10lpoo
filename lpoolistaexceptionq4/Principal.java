package lpoolistaexceptionq4;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		/*
		 Você foi contratado para desenvolver um sistema educacional infantil focado em aprendizado de geometria. 
		 Modele a classe "Triângulo" utilizando os conceitos de abstração e encapsulamento. Crie a exceção checada 
		 DimensoesInvalidasException e lance essa exceção no construtor e no método set dos lados quando suas dimensões 
		 foram inválidas. Considere que um triângulo só é válido se qualquer de seus lados forem maiores que o valor 
		 absoluto (módulo) da diferença dos outros dois lados e menor que a soma dos outros dois lados. Após modelar a 
		 classe Triangulo e a exceção DimensoesInvalidasException siga os seguintes passos:
		 
		 1 - Instanciar um objeto Triângulo com lados 3, 4 e 5
		 2 - Mudar a dimensão do primeiro lado para 10
		 3 - Ler do usuário três números
		 4 - Instanciar um objeto Triangular usando os valores lidos no passo anterior como lados
		*/
		Scanner leitor = new Scanner(System.in);
		Triangulo triangulo1 = null;
		
//		1 - Instanciar um objeto Triângulo com lados 3, 4 e 5
		try {
			triangulo1 = new Triangulo(3, 4, 5);
			System.out.println("Triângulo criado.");
		}catch (DimensoesInvalidasException e){
			System.out.println(e.getMessage());
		}
		
//		2 - Mudar a dimensão do primeiro lado para 10
		//Só funcionou quando  Triangulo triangulo1 = null
		try {
			triangulo1.setLado1(10);
			System.out.println("Modificado o lado 1.");
		}catch (DimensoesInvalidasException e){
			System.out.println(e.getMessage());
		}
		
//		3 - Ler do usuário três números
		System.out.println("Digite o lado 1: ");
		int lado1 = leitor.nextInt();
		System.out.println("Digite o lado 2: ");
		int lado2 = leitor.nextInt();
		System.out.println("Digite o lado 3: ");
		int lado3 = leitor.nextInt();
		
//		4 - Instanciar um objeto Triangular usando os valores lidos no passo anterior como lados
		try {
			Triangulo triangulo2 = new Triangulo(lado1, lado2, lado3);
			System.out.println("Triângulo criado.");
		}catch (DimensoesInvalidasException e){
			System.out.println(e.getMessage());
		}finally {
			leitor.close();
		}
		
	}
}
