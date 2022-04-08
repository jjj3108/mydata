package mdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"mdata.com", "mdata.md"})
public class MydataApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydataApplication.class, args);
		
	}

}
