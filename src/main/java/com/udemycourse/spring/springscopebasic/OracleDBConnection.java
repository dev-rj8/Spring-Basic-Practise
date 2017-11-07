package com.udemycourse.spring.springscopebasic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class OracleDBConnection implements DBConnection{

	public Logger logger = LoggerFactory.getLogger(OracleDBConnection.class);
	
	@Override
	public void createConnection() {
		logger.info("Oracle DB Connection Created!"+ this);
	}
}
