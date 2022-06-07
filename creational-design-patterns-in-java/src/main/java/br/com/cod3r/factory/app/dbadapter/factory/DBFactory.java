package br.com.cod3r.factory.app.dbadapter.factory;

import java.util.Objects;

import br.com.cod3r.factory.app.dbadapter.db.DB;
import br.com.cod3r.factory.app.dbadapter.db.OracleDB;
import br.com.cod3r.factory.app.dbadapter.db.PostgresDB;

public class DBFactory {
	
	public static DB getDatabase(DBTypes dbType) {
		dbType = Objects.requireNonNullElse(dbType, DBTypes.ORACLE);
		
		switch (dbType) {
		case POSTGRES:
			return new PostgresDB();
		case ORACLE:
		default:
			return new OracleDB();
		}
	}
}
