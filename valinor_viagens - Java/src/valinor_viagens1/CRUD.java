package valinor_viagens1;

import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) {
		
		String nome;
		int numero = 0;
		String cpf;
		String destino;
		int escolha = 0;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Escreva seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Escreva um número: ");
		numero = teclado.nextInt();
		System.out.println("Escreva seu cpf: ");
		cpf = teclado.nextLine();
		System.out.println("Escreva seu destino: ");
		destino = teclado.nextLine();
		System.out.println("Escolha o que deseja fazer = 1 - Novo cadastro, 2 - Alterar cadastro, 3 - Buscar cadastro, 4 - Deletar cadastro");
		escolha = teclado.nextInt();
		switch (escolha){
		case 1:
			System.out.println("Escreva seu nome: ");
			nome = teclado.nextLine();
			System.out.println("Escolha um número: ");
			numero = teclado.nextInt();
			System.out.println("Escreva seu cpf: ");
			cpf = teclado.nextLine();
			System.out.println("Escreva um destino ");
			destino = teclado.nextLine();
			break;
		case 2:
			System.out.println("Digite um novo nome ");
			nome = teclado.nextLine();
			System.out.println("Digite um novo numero: ");
			numero = teclado.nextInt();
			System.out.println("Digite um novo cpf: ");
			cpf = teclado.nextLine();
			System.out.println("Digite um novo destino: ");
			destino = teclado.nextLine();
			System.out.println("Cadastro alterado com sucesso, o novo nome é "+nome+", o novo número é "+numero+", o novo cpf é "+cpf+" e o novo destino é "+destino);
			break;
		case 3:
			System.out.println("Cadastro encontrado com sucesso, o nome é "+nome+", o número é "+numero+", o cpf é "+cpf+" e o destino é "+destino);
			break;
		case 4:
			numero = 0;
			nome = "";
			cpf = "";
			destino = "";
			System.out.println("O cadastro foi deletado com sucesso!");
			break;
		
		}
		
	}

}
