package br.com.cod3r.command.migration.tool;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.command.migration.commands.MigrationCommand;

public class MigrationTool {

	private List<MigrationCommand> commands;
	private int commandIndex = 0;
	
	public MigrationTool() {
		this.commands = new ArrayList<>();
	}
	
	public void addCommand(MigrationCommand command) {
		this.commands.add(command);
	}
	
	public void up() {
		if(commandIndex < commands.size()) {
			commands.get(commandIndex).execute();
			commandIndex++;
		} else {
			System.out.println("You're up to date");
		}
	}
}
