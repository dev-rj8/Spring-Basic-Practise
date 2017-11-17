# Chapter8 - Component Scan annotation
Which is focusing on below things:

* How to scan the classes which are not in main class package
* Here we have two packages one package is having main class and other package is having HelloWorld class

* If you not add package in @ComponentScan annotation it will give you below error message

Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'chapter8.componentscanannotation.HelloWorld' available

* remove the Component scan from main class and try it. 
 