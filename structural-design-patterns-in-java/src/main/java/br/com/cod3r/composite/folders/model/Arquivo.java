package br.com.cod3r.composite.folders.model;

public class Arquivo extends Component {

	public Arquivo(String nome) {
		super.nome = nome;
	}
	
	@Override
	public void print(String structure) {
		super.print(structure + this.nome);
	}

}