package br.com.cod3r.composite.folders.model;

import java.util.Collection;

public class Folder extends Component {
	
	private Collection<Component> components;

	public Folder(String nome, Collection<Component> components) {
		super.nome = nome;
		this.components = components;
	}

	@Override
	public void print(String structure) {
		super.print(structure + nome);
		components.forEach(component -> component.print(structure + "| "));
	}

}
