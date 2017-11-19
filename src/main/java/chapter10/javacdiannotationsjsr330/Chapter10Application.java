package chapter10.javacdiannotationsjsr330;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class Chapter10Application {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Chapter10Application.class);
		ApplicationContext appContext =  SpringApplication.run(Chapter10Application.class, args);

		DBConnectionPool connPool = appContext.getBean(DBConnectionPool.class);
		logger.info("ConnectionPool Object1 - "+connPool);
		connPool.getConnection().createConnection();
	}
}
