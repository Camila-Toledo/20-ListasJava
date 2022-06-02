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

		System.out.println("Percorrendo os contatos N da agenda usando índice");

		for (int i = 0; i < n; i++) {
			System.out.printf("Posição %d - %s \n", i, agenda.get(i));
			// System.out.println("Posição " + i + " - " + agenda.get(i));
		}

		int i;
		Scanner ler = new Scanner(System.in);

		System.out.println("\nInforme a posição a ser excluída: ");
		i = ler.nextInt();

		agenda.remove(i);

		System.out.println("Percorrendo os contatos N da agenda usando enhanced for");

		i = 0;
		for (String contato : agenda) {
			System.out.println("Posição " + i + " - " + contato);
			i++;
		}
	}

}
