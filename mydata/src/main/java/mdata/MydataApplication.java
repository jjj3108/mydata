package mdata;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"mdata.common","mdata.md"})
public class MydataApplication {
	public static void main(String[] args) {
		SpringApplication.run(MydataApplication.class, args);
		
	}

}
