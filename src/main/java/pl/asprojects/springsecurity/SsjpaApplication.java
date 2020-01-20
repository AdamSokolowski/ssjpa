package pl.asprojects.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import pl.asprojects.springsecurity.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SsjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsjpaApplication.class, args);
	}

}
