package chapter2.scopeprototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
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
