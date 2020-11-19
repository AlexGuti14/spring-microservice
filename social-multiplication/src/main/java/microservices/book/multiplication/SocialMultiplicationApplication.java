package microservices.book.multiplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SocialMultiplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialMultiplicationApplication.class, args);
	}

}
