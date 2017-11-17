package chapter8.componentscanannotation.main;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import chapter8.componentscanannotation.HelloWorld;

@SpringBootApplication
@ComponentScan("chapter8.componentscanannotation")
public class Chapter8Application {

	public static void main(String[] args) throws InterruptedException {
		Logger logger = LoggerFactory.getLogger(Chapter8Application.class);
		
		ApplicationContext app = SpringApplication.run(Chapter8Application.class, args);
		HelloWorld h = app.getBean(HelloWorld.class);
		logger.info(""+h);
	}
}
