package chapter8.componentscanannotation;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	public HelloWorld() {
		System.out.println("Hello World Object Created!");
	} 
}
