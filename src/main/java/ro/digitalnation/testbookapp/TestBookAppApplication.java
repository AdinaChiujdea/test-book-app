package ro.digitalnation.testbookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class TestBookAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestBookAppApplication.class, args);
	}

}
