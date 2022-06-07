package br.com.cod3r.chain.process;

import br.com.cod3r.chain.process.service.GenericService;
import br.com.cod3r.chain.process.service.ProcessContext;
import br.com.cod3r.chain.process.service.ServicesCatalog;

public class Client {

	public static void main(String[] args) throws Exception {
		ProcessContext context = new ProcessContext();
		context.setUserEmail("myemail@email.com.br");
		context.setUserPassword("pwd");
		context.setUserName("namen");
		
		String result = (String) GenericService.run(ServicesCatalog.saveUserService(), context);
		System.out.println(result);
	}
}
