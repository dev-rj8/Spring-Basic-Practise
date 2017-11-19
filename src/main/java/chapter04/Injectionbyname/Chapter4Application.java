package chapter04.Injectionbyname;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Chapter4Application {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(Chapter4Application.class);
		ApplicationContext appContext =  SpringApplication.run(Chapter4Application.class, args);

		ProductPrice pp = appContext.getBean(ProductPrice.class);
		logger.info("Product Final Price - "+ pp.getFinalPrice(10.00f));
	}
}
