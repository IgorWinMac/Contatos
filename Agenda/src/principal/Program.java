package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();

		List<String> pessoas = new ArrayList<>();

		int opcao = 0;

		do {

			System.out.println("Informe o nome: ");
			String nome = entrada.nextLine();
			pessoas.add(nome);

			System.out.println("Informe a idade: ");
			String idade = entrada.nextLine();
			pessoas.add(idade);

			System.out.println("Informe o telefone: ");
			String telefone = entrada.nextLine();
			pessoas.add(telefone);
			
			pessoa.pularLinha();

			System.out.println("Deseja continuar ? [1s] / [2n]");
			opcao = entrada.nextInt();
			
			entrada.nextLine();

		} while (opcao == 1);

		System.out.println(pessoas);
	}

}
