package lpoolistaexceptionq3;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Principal {

	public static void main(String[] args){
		/*
		 Faça um programa em JAVA que leia do usuário o caminho de um arquivo e em seguida crie um arquivo 
		 em branco no caminho lido. Por exemplo, se o usuário digitar o caminho “/Users/aluno/meuarquivo.txt” o 
		 programa deve criar um arquivo em branco nesse caminho. Utilize o método “createNewFile” da classe File 
		 para criar o arquivo. Faça o tratamento de exceção para quando o usuário informar um caminho inválido, o 
		 programa mostrar a mensagem “Caminho inválido”.
		*/
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o caminho:");
		String path = leitor.nextLine();
		
		File arquivo = new File(path);
		
		try {
			//Ao tentar criar o arquivo sem o bloco try catch, ocorreu erro. Esse é um cado de exceção checada
			//é obrigatório tratar este tipo de execeção de forma explícita.
			arquivo.createNewFile();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			leitor.close();
		}
		
		
	}

}
