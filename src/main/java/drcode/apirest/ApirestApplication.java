package drcode.apirest;

import drcode.apirest.model.Person;
import drcode.apirest.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApirestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(PersonRepository repository){
		return args -> {
			repository.save(new Person("Daniel", "Ribas"));
			repository.save(new Person("Vitor", "da Gracia"));
		};
	}

}
