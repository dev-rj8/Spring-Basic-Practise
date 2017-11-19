package chapter07.prototypescopecomplex;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Chapter7Application {

	public static void main(String[] args) throws InterruptedException {
		Logger logger = LoggerFactory.getLogger(Chapter7Application.class);
		ApplicationContext appContext =  SpringApplication.run(Chapter7Application.class, args);

		ProductPrice pp = appContext.getBean(ProductPrice.class);
		logger.info(""+pp);
		logger.info("Product Final Price - "+ pp.getFinalPrice(10.00f));
		
		//sleep two seconds
		TimeUnit.SECONDS.sleep(2);
		
		
		ProductPrice tt = appContext.getBean(ProductPrice.class);
		logger.info(""+tt);
		logger.info("Product Final Price - "+ tt.getFinalPrice(10.00f));
	}
}
