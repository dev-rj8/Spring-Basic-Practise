package chapter02.scopeprototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringScopeProtoTypeApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(SpringScopeProtoTypeApplication.class);
		ApplicationContext appContext =  SpringApplication.run(SpringScopeProtoTypeApplication.class, args);

		DBConnectionPool connPool = appContext.getBean(DBConnectionPool.class);
		logger.info("ConnectionPool Object1 - "+connPool);
		connPool.getConnection().createConnection();
		
		DBConnectionPool connPool2 = appContext.getBean(DBConnectionPool.class);
		logger.info("ConnectionPool Object2 - "+connPool2);
		connPool2.getConnection().createConnection();

	}
}
