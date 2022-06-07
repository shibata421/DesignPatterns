package br.com.cod3r.bridge.converter.converters;

import br.com.cod3r.bridge.converter.employees.Employee;

public class JsonConverter implements Converter {

	public String getEmployeeFormated(Employee emp) {
		StringBuilder builder = new StringBuilder();
		
		builder
		.append("{").append(System.lineSeparator())
			.append("\t\"name\": \"").append(emp.getName()).append("\",").append(System.lineSeparator())
			.append("\t\"age\": \"").append(emp.getAge()).append("\",").append(System.lineSeparator())
			.append("\t\"salary\": \"").append(emp.getSalary()).append("\"").append(System.lineSeparator())
		.append("}");
		
		return builder.toString();
	}

}
