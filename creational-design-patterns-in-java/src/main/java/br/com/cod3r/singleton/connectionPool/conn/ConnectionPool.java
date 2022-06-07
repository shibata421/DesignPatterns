package br.com.cod3r.singleton.connectionPool.conn;

import java.util.Collection;
import java.util.HashSet;

public class ConnectionPool {
	private final static int POOL_SIZE = 2;
	private final static ConnectionPool singleton = new ConnectionPool();
	private Collection<Connection> connectionsPool;

	private ConnectionPool() {
		System.out.println("Creating Connection Pool");
		connectionsPool = new HashSet<>();
		for (int i = 0; i < POOL_SIZE; i++) {
			connectionsPool.add(new Connection());
		}
	}
	
	public static ConnectionPool getInstance() {
		return singleton;
	}

	public Connection getConnection() {
		for (Connection conn : connectionsPool) {
			if (!conn.isInUse()) {
				conn.setInUse(true);
				return conn;
			}
		}

		System.out.println("No Connections avaiable");
		return null;
	}

	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}
}
