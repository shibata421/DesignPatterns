package br.com.cod3r.factory.app.dbadapter;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.factory.DBFactory;
import br.com.cod3r.factory.app.dbadapter.factory.DBTypes;

public class Client {

	public static void main(String[] args) {

		DB db = DBFactory.getDatabase(DBTypes.ORACLE);
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");

		DB db2 = DBFactory.getDatabase(DBTypes.POSTGRES);
		db2.query("SELECT * FROM users");
		db2.update("INSERT INTO users VALUES ('User', 25)");
	}
}
