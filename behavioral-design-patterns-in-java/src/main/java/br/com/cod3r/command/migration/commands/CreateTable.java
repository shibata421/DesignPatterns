package br.com.cod3r.command.migration.commands;

import java.util.ArrayList;
import java.util.List;

public class CreateTable extends MigrationCommand {
	
	private List<List<String>> database;
	private List<String> table;

	public CreateTable(List<List<String>> database) {
		this.database = database;
	}
	
	@Override
	public void execute() {
		System.out.println("Creating Table");
		this.table = new ArrayList<>();
		table.add("Id");
		table.add("Name");
		table.add("Email");
		table.add("Password");
		database.add(table);
		System.out.println(database);
	}

}
