package chapter10.javacdiannotationsjsr330;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named
public class DBConnectionPool {

	@Inject
	public DBConnection mongoDBConnection;
	
	public DBConnection getConnection() {
		return mongoDBConnection;
	}

	public void setConnection(DBConnection connection) {
		this.mongoDBConnection = connection;
	}
	
	
}
