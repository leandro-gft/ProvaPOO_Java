package br.com.gft.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.gft.model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);

		List<Pessoa> pes = new ArrayList<Pessoa>();
		pes.add(p1);
		pes.add(p2);
		pes.add(p3);
		pes.add(p4);

		int older = 0;
		String nome = "";
		for (int i = 0; i < pes.size(); i++) {
			if (older < pes.get(i).getIdade()) {
				older = pes.get(i).getIdade();
				nome = pes.get(i).getNome();
			}
		}
		System.out.println();
		System.out.println("O mais velho é: " + nome);
		System.out.println("");

		System.out.println("Elementos da lista: ");
		for (int i = 0; i < pes.size(); i++) {
			System.out.println(pes.get(i).getNome() + " - " + pes.get(i).getIdade() + " anos");

		}
		System.out.println("A lista possui " + pes.size() + " elementos");
		System.out.println("");
		
		for (int i = 0; i < pes.size(); i++) {
			if (pes.get(i).getIdade() < 18) {
				pes.remove(i);
			}
			
		}
		System.out.println("Elementos da lista com idade maior ou igual a 18 anos: ");
		for (int i = 0; i < pes.size(); i++) {
		System.out.println(pes.get(i).getNome() + " - " + pes.get(i).getIdade() + " anos");
		}
		System.out.println("A lista possui " + pes.size() + " elementos");
		System.out.println("");
		System.out.println("Elementos da lista com nome igual a Jessica: ");
		for (int i = 0; i < pes.size(); i++) {
			if (pes.get(i).getNome().equals("Jessica")) {
				System.out.println(pes.get(i).getNome() + " - " + pes.get(i).getIdade() + " anos");
			}

		}

	}
}
