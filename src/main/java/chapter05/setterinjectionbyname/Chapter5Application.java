package chapter05.setterinjectionbyname;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Chapter5Application {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Chapter5Application.class);
		ApplicationContext appContext =  SpringApplication.run(Chapter5Application.class, args);

		ProductPrice pp = appContext.getBean(ProductPrice.class);
		logger.info("Product Final Price - "+ pp.getFinalPrice(10.00f));
	}
}
