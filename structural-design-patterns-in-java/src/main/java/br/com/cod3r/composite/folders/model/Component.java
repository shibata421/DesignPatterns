package br.com.cod3r.composite.folders.model;

public abstract class Component {
	
	protected String nome;
	
	public String getNome() {
		return this.nome;
	}
	
	public void print(String structure) {
		System.out.println(structure);
	}
}
