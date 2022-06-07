package br.com.cod3r.composite.folders;

import java.util.Arrays;
import java.util.HashSet;

import br.com.cod3r.composite.folders.model.Arquivo;
import br.com.cod3r.composite.folders.model.Component;
import br.com.cod3r.composite.folders.model.Folder;

public class Client {

	public static void main(String[] args) {
		Component file = new Arquivo("artigo.docx");
		Component file2 = new Arquivo("README.md");
		Component file3 = new Arquivo("mySqlQuery.sql");
		Component file4 = new Arquivo("javaKlazz.class");
		
		Component folder = new Folder("folder", Arrays.asList(file, file2));
		Component folder2 = new Folder("folder2", new HashSet<>(Arrays.asList(file)));
		Component folder3 = new Folder("folder3", Arrays.asList(folder2, file3, file4));
		Component folderRoot = new Folder("root", new HashSet<>(Arrays.asList(folder, file3, file4, folder3)));
		folderRoot.print("");
	}
}
