package br.com.gft.model;

public abstract class Funcionario {
	private double salario;
	private int idade;
	private String nome;

	public Funcionario(String nome, int idade, double salario) {
		this.salario = salario;
		this.nome = nome;
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double bonificacao() {
		return salario;
	}
}
