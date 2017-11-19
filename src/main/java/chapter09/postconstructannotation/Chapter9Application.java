package chapter09.postconstructannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Chapter9Application {
	
	public static void main(String[] args) {
		
		ApplicationContext app = SpringApplication.run(Chapter9Application.class, args);
		app.getBean(HelloWorld.class);
	}

}
