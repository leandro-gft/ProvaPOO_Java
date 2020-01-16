package br.com.gft.main;

import br.com.gft.model.Gerente;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;

public class Main {
public static void main(String[] args) {
	Gerente g = new Gerente("Leandro", 31, 15000.00);
	Supervisor s = new Supervisor ("Ariane", 24, 7000.00);
	Vendedor v = new Vendedor ("Gabriel", 24, 1500.00);
	
	System.out.println("Gerente: " +g.getNome()+ " - Salario: "+g.bonificacao());
	System.out.println("Supervisor: " +s.getNome()+ " - Salario: "+s.bonificacao());
	System.out.println("Vendedor: " +v.getNome()+ " - Salario: "+v.bonificacao());
	
}
}
