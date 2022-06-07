package br.com.cod3r.command.migration;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.command.migration.commands.CreateColumn;
import br.com.cod3r.command.migration.commands.CreateTable;
import br.com.cod3r.command.migration.tool.MigrationTool;

public class Client {

	public static void main(String[] args) {
		List<List<String>> database = new ArrayList<>();
		MigrationTool tool = new MigrationTool();
		tool.addCommand(new CreateTable(database));
		tool.addCommand(new CreateColumn());

		tool.up();
		tool.up();
		tool.up();
		
	}
}
