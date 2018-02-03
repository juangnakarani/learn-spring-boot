# Learn Spring Boot 1.5.10
This is my code documentation while learning about Spring Boot 1.5.10.
I use Eclipse Oxygen for the IDE and Gradle Build Tools version 4.1

On this Eclipse version, Gradle tool was adding by default installation, so we don't need install 
Gradle plugin any more. It just create from menu File -> New -> Project -> Gradle Project.

`App.java` is first class that will be call by java runtime to run this application. Main point
of this file:
1. `@SpringBootApplication@`
	This annotation is a convenience annotation that adds all of the following:
	`@Configuration`, `@EnableAutoConfiguration`, `@ComponentScan`. I commented out the line because it's just simple by this one(`@SpringBootApplication`).
2. function `main(String[] args)`
	This function will call `SpringApplication.run(App.class, args)`. The parameter args is passing from system properties.
	Sometimes, We will need some OS arguments to application. e.g: `java -jar -Dserver.port=8888 learn-spring-boot-1.0.jar`. 

`Auth.java` file is learn about controller. There are url mapping, request method(get|post), consume request body.
The interesting one is the Spring Boot doesn`t need annotation `@Consumes("application/json")` like previous Spring MVC or JAX-RS. 
Today Spring Boot use `fasterxml` library for JSON data-binding. It`s just set java beans that have equeal class member with request payload.
In this example is `User.java`. The critical point is the java bean must have default constructor. Exception JSON parse error will be facing if there is no default constructor 


