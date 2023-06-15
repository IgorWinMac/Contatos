package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Pessoa pessoa ;

		List<Pessoa> pessoas = new ArrayList<>();

		int opcao = 0;

		do {
			pessoa = new Pessoa();
			System.out.println("Informe o nome: ");
			String nome = entrada.nextLine();
			pessoa.setNome(nome);

			System.out.println("Informe a idade: ");
			int idade = entrada.nextInt();
			pessoa.setIdade(idade);

			System.out.println("Informe o telefone: ");
			String telefone = entrada.nextLine();
			pessoa.setTelefone;
			
			pessoa.pularLinha();

			System.out.println("Deseja continuar ? [1s] / [2n]");
			opcao = entrada.nextInt();
			
			entrada.nextLine();
		pessoas.add(pessoa);
		} while (opcao == 1);

		for(Pessoa p : pessoas){
		System.out.println(p);
		}
	}

}
