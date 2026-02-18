package aulaJPA.aula01;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		// Variaveis
		String nome;
		int idade;
		
		
		System.out.println("Informe o seu nome: ");
		nome = ler.next ();
		
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();

		
		System.out.println ("Você é " + nome + " e tem " + idade + " anos" );
		
	}

}
