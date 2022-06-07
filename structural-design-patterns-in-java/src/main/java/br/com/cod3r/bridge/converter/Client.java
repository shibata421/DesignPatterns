package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.Employee;
import br.com.cod3r.bridge.converter.employees.ITGuy;

public class Client {

	public static void main(String[] args) {
		Converter csvConverter = new CSVConverter();
		Employee itGuy = new ITGuy("Eye Tea Guy", 60, 4000.0);

		Converter jsonConverter = new JsonConverter();
		Employee manager = new ITGuy("Jason C. Verter", 80, 5000.0);
		
		System.out.println(csvConverter.getEmployeeFormated(itGuy));
		System.out.println(jsonConverter.getEmployeeFormated(manager));
	}
}
