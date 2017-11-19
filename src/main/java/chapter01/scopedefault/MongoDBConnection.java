package chapter01.scopedefault;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBConnection implements DBConnection {

	public Logger logger = LoggerFactory.getLogger(MongoDBConnection.class);
	
	@Override
	public void createConnection() {
		logger.info("Mongo DB Connection Created!"+ this);
	}

}
