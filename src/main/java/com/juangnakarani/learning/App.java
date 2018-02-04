package com.juangnakarani.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class App {
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
    
}
