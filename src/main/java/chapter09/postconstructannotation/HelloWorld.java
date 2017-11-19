package chapter09.postconstructannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	String message = "Hello World!";
	public HelloWorld() {
		System.out.println(message);
	}
	
	@PostConstruct
	public void changeMessage() {
		message = "Hello PostContruct!";
		System.out.println(message);
	}
	
	@PreDestroy
	public void printMessageBeforeDead() {
		message = "Hello PreDestroy!";
		System.out.println(message);
	}
	
}
