package br.com.glandata.main;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaArrayList {

	public static void main(String[] args) {

		ArrayList<String> agenda = new ArrayList<String>();
		agenda.add("Giancarlo;11-9999-8888");
		agenda.add("Amanda;11-8888-9999");
		agenda.add("Alessandra;11-2222-8888");
		agenda.add("Kelly;11-7777-4444");

		System.out.println(agenda);

		int n = agenda.size(); // Retorna o total de elementos da lista

		System.out.println("Percorrendo os contatos N da agenda usando �ndice");

		for (int i = 0; i < n; i++) {
			System.out.printf("Posi��o %d - %s \n", i, agenda.get(i));
			// System.out.println("Posi��o " + i + " - " + agenda.get(i));
		}

		int i;
		Scanner ler = new Scanner(System.in);

		System.out.println("\nInforme a posi��o a ser exclu�da: ");
		i = ler.nextInt();

		agenda.remove(i);

		System.out.println("Percorrendo os contatos N da agenda usando enhanced for");

		i = 0;
		for (String contato : agenda) {
			System.out.println("Posi��o " + i + " - " + contato);
			i++;
		}
	}

}
